package com.fp.frameworkManager;

import com.fp.reporting.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebDriverManager extends EventFiringWebDriver {

    public static WebDriver driver = null;
    private static String browser = System.getProperty("browserName");
    private static String version = System.getProperty("version");
    private static String os = System.getProperty("os");
    private static String execPlatform = System.getProperty("execPlatform");
    private static String deviceName = System.getProperty("deviceName");
    private static DesiredCapabilities dc = new DesiredCapabilities();

    private static final Thread CLOSE_THREAD = new Thread(() -> driver.quit());

    public static WebDriver getDriver() {
        try {
            if (execPlatform.equals("native")) {
                switch (browser) {
                    case "chrome":
                        System.setProperty("webdriver.chrome.driver", "C:/Users/amacha/cucumberproject/MyMavenProject/src/test/resources/drivers/chromedriver.exe");
                        System.setProperty("webdriver.chrome.silentOutput", "true");
                        ChromeOptions options = new ChromeOptions();
                        Map<String, Boolean> excludes = new HashMap<>();
                        Map<String, Object> protocolHandler = new HashMap<>();
                        Map<String, Object> prefs = new HashMap<>();

                        excludes.put("wb", true);
                        protocolHandler.put("excluded_schemes", excludes);
                        prefs.put("protocol_handler", protocolHandler);

                        options.setExperimentalOption("prefs", prefs);
                        try {
                            File extension = new File("out/extensions/auth");
                            ChromeExtensionBuilder chromeExtensionBuilder = new ChromeExtensionBuilder();
                            chromeExtensionBuilder.BuildAuthExtension(extension.getPath());
                            options.addArguments("load-extension=" + extension.getCanonicalPath());
                        } catch (IOException e) {
                            e.printStackTrace();
//						throw new ProvisionException(e.getMessage(), e);
                        }

                        driver = new ChromeDriver(options);
                        driver.manage().timeouts()
                                .implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        System.setProperty("webdriver.gecko.driver", "C:/Users/amacha/cucumberproject/MyMavenProject/src/main/resources/drivers/geckodriver.exe");
                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("firefox_binary", "C:/Program Files/Mozilla Firefox/firefox.exe");
                        driver = new FirefoxDriver(capabilities);

                        driver.manage().timeouts()
                                .implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "ie":
                        driver = new InternetExplorerDriver();
                        driver.manage().timeouts()
                                .implicitlyWait(40, TimeUnit.SECONDS);
                        break;
                    case "safari":
                        driver = new SafariDriver();
                        driver.manage().timeouts()
                                .implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    default:
                        System.out
                                .println("Specified capabilities are not set for native tesing");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return driver;
    }

    public WebDriverManager() {
        super(driver);
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException(
                    "WebDriver will shutdown when JVM exits");
        }
        super.close();
    }

    @After
    public void captureScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            System.out.println("Scenario failed: " + scenario.getStatus());
            try {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String path = "screenshots/" + System.currentTimeMillis() + ".png";
                FileUtils.copyFile(scrFile, new File("out/" + path));
                Reporter.addScreenCaptureFromPath(path);
            } catch (WebDriverException | IOException e) {
                System.err.println(e.getMessage());
            }
        }
        if (driver != null) {
            driver.quit();
        }
    }

}
