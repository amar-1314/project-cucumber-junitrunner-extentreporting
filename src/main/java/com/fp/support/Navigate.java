package com.fp.support;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Navigate {
    private final WebDriver driver;
    private static Properties prop = System.getProperties();
    private static FileInputStream input;
    private String baseUrl;
    private String rel = "";

    @Inject
    public Navigate(WebDriver driver) {
        this.driver = driver;
    }

    private void navigateUrl() {
        driver.manage().window().maximize();
        try {
            File testfile = new File(this.getClass().getResource("/config.properties").toURI());
            input = new FileInputStream(testfile);
            prop.load(input);
            String url = prop.getProperty(baseUrl);
            driver.get(url + rel);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void toCustomerPortal() {
        baseUrl = "customerportalUrl";
        navigateUrl();
    }

    public Navigate toWorkbench() {
        baseUrl = "workbechUrl";
        return this;
    }

    public void sales() {
        rel = "sales";
    }
}
