package com.fp.locators.workbench;

import org.openqa.selenium.By;

public class ObjectRepository {

    public By newLead_Link = By.cssSelector("#nav-navbar [href='/#/sales/lead/create'] span");
    public By leadSource_slect = By.cssSelector("select#leadSource");
    public By firstName_text = By.cssSelector("#create-lead-form #firstName");
    public By lastName_text = By.cssSelector("#create-lead-form #lastName");
    public By phone_text = By.cssSelector("#create-lead-form #phone");
    public By email_text = By.cssSelector("#create-lead-form #email");
    public By subId_text = By.cssSelector("#create-lead-form #subId");
    public By add1_text = By.cssSelector("#create-lead-form #line1");
    public By add2_text = By.cssSelector("#create-lead-form #line2");
    public By zipCode_text = By.cssSelector("#create-lead-form #zipCode");
    public By city_text = By.cssSelector("#create-lead-form #city");
    public By state_text = By.cssSelector("#create-lead-form #state");
    public By saveLead_button = By.cssSelector("#btn-save-new-lead");
    public By overlay_spinner = By.id("overlay-content");

    public By confirmMessageContainer = By.id("confirmMessageContainer");
    public By confirmMessageContainer_Header = By.cssSelector("#confirmMessageContainer h3");
    public By confirmMessageContainer_confirm = By.cssSelector("#confirmMessageContainer button[ng-click='ok()']");

}
