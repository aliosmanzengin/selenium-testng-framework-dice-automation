package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void diceTestMethod() {
        //open dice.com
        driver.get("https://www.dice.com");
        System.out.println("Dice Opened. Test Passed!");
    }
}

