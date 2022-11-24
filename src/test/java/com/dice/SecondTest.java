package com.dice;

import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void linkedinTestMethod() {
        driver.get("https://www.linkedin.com");
        System.out.println("Linkedin Opened. Test Passed!");
    }
}
