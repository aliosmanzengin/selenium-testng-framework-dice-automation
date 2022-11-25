package com.dice.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected Logger log;

    @BeforeClass
    protected void setUpClass(ITestContext context) {
        String testName = context.getCurrentXmlTest().getName();
        log = Logger.getLogger(testName);
    }

    @Parameters({"browser"})
    @BeforeMethod
    protected void methodSetUp(String browser) {
        log.info("setup method working");
        driver = BrowserFactory.getDriver(browser, log);
    }


//    @BeforeMethod
//    protected void methodSetUp() {
//        log.info("setup method working");
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
//        driver = new FirefoxDriver();
//    }
    @AfterMethod
    protected void methodTearDown() {
        log.info("teardown method working");
        driver.close();
    }
}
