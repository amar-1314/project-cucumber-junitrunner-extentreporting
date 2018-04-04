package com.fp.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class MyAccount {
    private final WebDriver driver;

    //	private static FileInputStream input;
//	private static Properties prop = System.getProperties();
    @Inject
    public MyAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.navigate().to("http://google.com");
        System.out.println("IN PAGE"+driver.hashCode());
//        driver.findElement(ObjectRepository.userName).sendKeys("Frontpuser1@gmail.com");
//        driver.findElement(ObjectRepository.password).sendKeys("Password123");
//        driver.findElement(ObjectRepository.loginButton).click();
    }
}
