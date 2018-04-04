package com.fp.steps.workbench;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadStepDefs {

    @Given("^user on workbench sales screen$")
    public void user_on_workbench_sales_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user clicks on new lead link$")
    public void user_clicks_on_new_lead_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user creates lead with$")
    public void user_creates_lead_with(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    }

    @Then("^user clicks on save lead$")
    public void user_clicks_on_save_lead() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user confirm TCPA permission$")
    public void user_confirm_TCPA_permission() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user gets leadId$")
    public void user_gets_leadId() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
