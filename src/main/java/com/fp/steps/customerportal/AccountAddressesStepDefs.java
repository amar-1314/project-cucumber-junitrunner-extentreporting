package com.fp.steps.customerportal;

import com.fp.data.AccountInfo;
import com.fp.data.World;
import com.fp.helpers.Assertion;
import com.fp.locators.customerportal.CpLocators;
import com.fp.pages.customerportal.Login;
import com.fp.support.UIActions;
import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AccountAddressesStepDefs {

    private  final WebDriver driver;
    private  final Login login;
    private final UIActions ui;
    private final Assertion assertion;
    private final World world;
//    private AccountInfo accountInfo;
    @Inject
    public AccountAddressesStepDefs(Login login, WebDriver driver, UIActions ui, Assertion assertion, World world) {
        this.driver = driver;
        this.login = login;
        this.ui = ui;
        this.assertion = assertion;
        this.world = world;
//        this.accountInfo = accountInfo;
    }

    @Then("^user validates account addresses header$")
    public void user_validates_account_addresses_header(List<AccountInfo> accountInfoList) throws Throwable {
        AccountInfo accountInfo = accountInfoList.get(0);
        assertion.assertThat(ui.GetText(CpLocators.AS_WLA_AccountAddressesHeader_Label)).as("Account address header").isEqualTo(accountInfo.getAccountAddressesHeader());
        assertion.assertAll();
    }

    @Then("^user logs out$")
    public void logout() {
        System.out.println(world.accountInfo);
//        System.out.println(accountInfo);
        ui.ClickButton(CpLocators.WB_Logout);
    }
}
