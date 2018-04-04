package com.fp.pages.workbench;

import com.fp.support.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.inject.Inject;

public class LoginPage {
    private final WebDriver driver;
    private final Navigate navigate;

    @Inject
    public LoginPage(WebDriver driver, Navigate navigate) {

        this.driver = driver;
        this.navigate = navigate;
    }

    public LoginPage login() {
        navigate.toWorkbench().sales();
        checkForPopups();
        return this;
    }

    /**
     * Verify if you have pop ups on screen and close
     */
    private void checkForPopups() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            wait.until(ExpectedConditions.and(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")),
                    ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")),
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-content"))));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-content")));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-content")));
        } catch (TimeoutException e) {
//			e.printStackTrace();
        }
        if (driver.findElements(By.cssSelector(".modal-content")).size() == 1) {
            driver.findElement(By.cssSelector(".modal-content button.btn-default")).click();
        }
    }

}
