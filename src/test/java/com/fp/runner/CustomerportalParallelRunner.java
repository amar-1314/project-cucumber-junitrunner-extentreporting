package com.fp.runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedParallelCucumber.class)
@ExtendedCucumberOptions(
        threadsCount = 2,
        jsonReport = "target/json/FrontPointReport-report.json",
        overviewReport = true,
        outputFolder = "target",
        detailedReport = true,
        detailedAggregatedReport = true,
        toPDF = true)
@CucumberOptions(
        plugin = {"pretty", "html:target/html/FrontPointReport", "json:target/json/FrontPointReport-report.json"},
        features = {"classpath:features"},
        glue = {"classpath:com.fp.steps", "classpath:com.fp.pages", "classpath:com.fp.frameworkManager"},
        tags = {"@desktop"},
        monochrome = true
)
public class CustomerportalParallelRunner {
}
