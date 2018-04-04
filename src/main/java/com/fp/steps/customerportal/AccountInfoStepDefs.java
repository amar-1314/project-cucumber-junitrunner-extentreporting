package com.fp.steps.customerportal;

import com.fp.data.AccountInfo;
import com.fp.data.World;
import com.fp.helpers.Assertion;
import com.fp.locators.customerportal.CpLocators;
import com.fp.pages.customerportal.AccountSettings;
import com.fp.pages.customerportal.Login;
import com.fp.support.UIActions;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.util.List;

public class AccountInfoStepDefs {

    private final WebDriver driver;
    private final Login login;
    private final UIActions ui;
    private final Assertion assertion;
    private final AccountSettings accountSettings;
    private final World world;
//    private AccountInfo accountInfo;


    @Inject
    public AccountInfoStepDefs(Login login, WebDriver driver, UIActions ui, Assertion assertion, AccountSettings accountSettings, World world) {
        this.driver = driver;
        this.login = login;
        this.ui = ui;
        this.assertion = assertion;
        this.accountSettings = accountSettings;
        this.world = world;
//        this.accountInfo = accountInfo;
    }

    @Given("^user launches customer portal application on desktop$")
    public void user_launches_customer_portal_application_on_desktop() throws Throwable {
        login.login();
        try {
            ui.waitUntilClickable(CpLocators.LP_WB_Login, CpLocators.LP_WT_UserName, CpLocators.LP_WT_password, CpLocators.LP_WB_Login);
        } catch (WebDriverException e) {
            throw new WebDriverException("User is not on login page");
        }
    }

    @When("^user logs in with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_with_user_name_and_password(String userName, String password) throws Throwable {
        ui.waitUntilClickable(CpLocators.LP_WB_Login);
        ui.SetTextBox(CpLocators.LP_WT_UserName, userName);
        ui.SetTextBox(CpLocators.LP_WT_password, password);
        ui.ClickButton(CpLocators.LP_WB_Login);
    }

    @Then("^user navigates to my account page$")
    public void user_navigates_to_my_account_page() throws Throwable {
        ui.waitUntilClickable(CpLocators.WB_Logout, CpLocators.LN_Shop_Link);
        assertion.assertThat(driver.findElement(CpLocators.WB_Logout).isDisplayed()).as("Logout button").isTrue();
        assertion.assertAll();
    }

    @Then("^user validates account info section with$")
    public void user_validates_account_info_section_with(List<AccountInfo> accountInfoList) throws Throwable {
//        accountInfo = accountInfoList.get(0);
        world.accountInfo = accountInfoList.get(0);
        accountSettings.validateAccountInfo(world.accountInfo);
    }

    @Then("^user validates account info section$")
    public void validate() {
        accountSettings.validateAccountInfo(world.accountInfo);
    }

    @Then("^user click on edit account info icon$")
    public void user_click_on_edit_account_info_icon() throws Throwable {
        ui.waitUntilClickable(CpLocators.AccInfo_Edit);
        ui.ClickButton(CpLocators.AccInfo_Edit);
    }

    @Then("^user clicks on save button$")
    public void user_clicks_on_save_button() throws Throwable {
        ui.waitUntilClickable(CpLocators.AccInfo_Save);
        ui.ClickButton(CpLocators.AccInfo_Save);
        ui.waitUntilVisible(By.id("loading-bar"));
        ui.waitUntilInvisible(By.id("loading-bar"));
    }

    @Then("^user edits primary phone number with \"([^\"]*)\"$")
    public void user_edits_primary_phone_number_with(String phone) throws Throwable {
        ui.waitUntilVisible(CpLocators.AccInfo_PrPhone_Edit);
        ui.SetTextBox(CpLocators.AccInfo_PrPhone_Edit, phone);
    }

    @Then("^user validates primary phone \"([^\"]*)\"$")
    public void user_validates_primary_phone(String primaryPhone) throws Throwable {
        accountSettings.validateAccountInfoPrimaryPhone(primaryPhone);
    }

}
