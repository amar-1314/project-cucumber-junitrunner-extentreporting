package com.fp.runner;

import com.fp.reporting.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.fp.reporting.ExtentCucumberFormatter:out/report.html"},
        features = {"classpath:features"},
        glue = {"classpath:com.fp.steps", "classpath:com.fp.pages", "classpath:com.fp.frameworkManager"},
        tags = {"@testrun", "~@manual"},
        monochrome = true
)
public class CustomerportalRunnerExtent {
    @AfterClass
    public static void loadReportProperties() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
    }
}
