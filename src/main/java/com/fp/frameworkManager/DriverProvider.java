package com.fp.frameworkManager;

import cucumber.api.java.Before;

public class DriverProvider {

    @Before
    public void getDriver(){
        WebDriverManager.getDriver();
    }
}
