package com.fp.steps.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefs {

    @Given("^user on customer portal login page\\.$")
    public void user_on_customer_portal_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user logs in with user name \"([^\"]*)\" and password \"([^\"]*)\"\\.$")
    public void user_logs_in_with_user_name_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user logs out\\.$")
    public void user_logs_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
