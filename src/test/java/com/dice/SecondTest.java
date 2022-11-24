package com.dice;

import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void linkedinTestMethod() {
        driver.get("https://www.linkedin.com");
        System.out.println("Linkedin Opened. Test Passed!");
    }
}
