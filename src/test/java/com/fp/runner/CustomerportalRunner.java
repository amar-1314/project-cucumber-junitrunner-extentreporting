package com.fp.runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/json/FrontPointReport-report.json",
        overviewReport = true,
        detailedReport = true,
        outputFolder = "target/html/feature-overview")
@CucumberOptions(
        plugin = {"pretty", "html:target/html/FrontPointReport", "json:target/json/FrontPointReport-report.json"},
        features = {"classpath:features"},
        glue = {"classpath:com.fp.steps", "classpath:com.fp.pages", "classpath:com.fp.frameworkManager"},
        tags = {"@desktop"},
        monochrome = true
)
public class CustomerportalRunner {
}
