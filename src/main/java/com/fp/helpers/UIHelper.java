package com.fp.helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIHelper {

    private WebDriver driver;

    public UIHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        waitForClickable(locator);
        driver.findElement(locator).click();
    }

    public void select(By locator, String text) {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(text);
    }

    public void sendKeys(By locator, CharSequence... keys) {
        driver.findElement(locator).sendKeys(keys);
    }

    public void waitForClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForInvisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


}
