package com.fp.pages;

import org.openqa.selenium.By;

public class ObjectRepository {
    public static By userName = By.cssSelector("#form-login [name='login-username']");
    public static By password = By.cssSelector("#form-login [name='login-password']");
    public static By loginButton = By.cssSelector("#form-login button[type='submit']");

}
