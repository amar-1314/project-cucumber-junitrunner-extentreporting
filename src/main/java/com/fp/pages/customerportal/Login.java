package com.fp.pages.customerportal;

import com.fp.support.Navigate;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private final Navigate navigate;
    private final WebDriver driver;

    @Inject
    public Login(WebDriver driver) {
        this.navigate = new Navigate(driver);
        this.driver = driver;
    }

    public Login login(){
        navigate.toCustomerPortal();
        return this;
    }

}
