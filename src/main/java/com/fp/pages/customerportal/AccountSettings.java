package com.fp.pages.customerportal;

import com.fp.data.AccountInfo;
import com.fp.helpers.Assertion;
import com.fp.locators.customerportal.CpLocators;
import com.fp.support.UIActions;
import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSettings {

    private final WebDriver driver;
    private final Assertion assertion;
    private final UIActions ui;

    @Inject
    public AccountSettings(WebDriver driver, Assertion assertion, UIActions ui) {
        this.driver = driver;
        this.assertion = assertion;
        this.ui = ui;
    }

    public void validateAccountInfo(AccountInfo accountInfo) {
        validateAccountInfoHeader(accountInfo.getAccountInfoHeader());
        validateAccountInfoLabels(accountInfo);
        validateAccountInfoName(accountInfo.getName());
        validateAccountInfoEmail(accountInfo.getEmail());
        validateAccountInfoPrimaryPhone(accountInfo.getPrimaryPhone());
        validteAccountInfoSecondaryPhone(accountInfo.getSecondaryPhone());
        assertion.assertAll();
    }

    public void validateAccountInfoPrimaryPhone(String primaryPhone) {
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        List<WebElement> elements = driver.findElements(CpLocators.AS_WLA_AccountInfoSection_Values);
        assertion.assertThat(ui.GetText(elements.get(2))).as("Primary phone").isEqualTo(primaryPhone);
    }

    public void validteAccountInfoSecondaryPhone(String secondaryPhone) {
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        List<WebElement> elements = driver.findElements(CpLocators.AS_WLA_AccountInfoSection_Values);
        assertion.assertThat(ui.GetText(elements.get(3))).as("Secondary phone").isEqualTo(secondaryPhone);
    }

    public void validateAccountInfoName(String name) {
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        List<WebElement> elements = driver.findElements(CpLocators.AS_WLA_AccountInfoSection_Values);
        assertion.assertThat(ui.GetText(elements.get(0))).as("Name").isEqualTo(name);
    }

    public void validateAccountInfoEmail(String email) {
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        List<WebElement> elements = driver.findElements(CpLocators.AS_WLA_AccountInfoSection_Values);
        assertion.assertThat(ui.GetText(elements.get(1))).as("Email").isEqualTo(email);
    }

    public void validateAccountInfoLabels(AccountInfo accountInfo){
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        List<WebElement> elements = driver.findElements(CpLocators.AS_WLA_AccountInfoSection_Labels);
        assertion.assertThat(ui.GetText(elements.get(0))).as("Name label").isEqualTo(accountInfo.getNameLabel());
        assertion.assertThat(ui.GetText(elements.get(1))).as("Email label").isEqualTo(accountInfo.getEmailLabel());
        assertion.assertThat(ui.GetText(elements.get(2))).as("Primary phone label").isEqualTo(accountInfo.getPrimaryPhoneLabel());
        assertion.assertThat(ui.GetText(elements.get(3))).as("Secondary phone label").isEqualTo(accountInfo.getSecondaryPhoneLabel());
    }

    public void validateAccountInfoHeader(String headerLabel){
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        assertion.assertThat(ui.GetText(CpLocators.AS_WLA_AccountInfoHeader_Label)).as("Account info header").isEqualTo(headerLabel);
    }
}
