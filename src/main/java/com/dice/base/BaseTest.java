package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void methodSetUp() {
        System.out.println("setup method working");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void methodTearDown() {
        System.out.println("teardown method working");
        driver.close();
    }
}
