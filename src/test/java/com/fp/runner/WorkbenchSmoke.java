package com.fp.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/html/FrontPointReport", "json:target/json/FrontPointReport-report.json"},
        features = {"classpath:features"},
        glue = {"classpath:com.fp.steps", "classpath:com.fp.pages", "classpath:com.fp.frameworkManager"},
        tags = {"@smokeui"},
        monochrome = true
)
public class WorkbenchSmoke {

}
