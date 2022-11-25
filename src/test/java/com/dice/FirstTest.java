package com.dice;

import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void diceTestMethod() {
        //open dice.com
        driver.get("https://www.dice.com");
        log.info("Dice Opened. Test Passed!");
    }
}

