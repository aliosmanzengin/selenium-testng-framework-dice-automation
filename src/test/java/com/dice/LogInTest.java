package com.dice;

import com.dice.base.BaseTest;
import com.dice.base.CsvDataProvider;
import com.dice.pages.LoginPage;
import com.dice.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class LogInTest extends BaseTest {

    @Test
    public void positiveLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        String expectedPageTitle = "Dashboard Home Feed | Dice.com";
        String expectedUsername = "Ali Osman Zengin";
        // 1st - Open dice login page
        loginPage.openLoginPage();
        // Filluo email and passwrd
        loginPage.fillUpEmailAndPassword("alizengin.qa@gmail.com", "PASS0idi.");
        // Push Sign in button and wait for page to load
        ProfilePage profilePage = loginPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();
        // Verifications: -Title -Profile Name
        System.out.println("verifying");
        String actualPageTitle = profilePage.getTitle();
        Assert.assertTrue(expectedPageTitle.equals(actualPageTitle), "Page title is not matching!" +
                "\nactual page title is: " + actualPageTitle +
                "\nbut expected title was: " + expectedPageTitle);
        Assert.assertTrue(profilePage.isCorrectProfileLoaded(expectedUsername), "Profile name is not expected");
    }

    @Test(dataProvider = "CsvDataProvider", dataProviderClass = CsvDataProvider.class)
    public void negativeLogInTest(Map<String, String> testdata) {
        String expectedErrorMessage = "Email and/or password incorrect.";
        String testNumber = testdata.get("no");
        String email = testdata.get("email");
        String password = testdata.get("password");
        String description = testdata.get("description");

        System.out.println("Test No#" + testNumber + " for " + description + "Where\nEmail:" + email + "\nPassword" + password);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.fillUpEmailAndPassword("alizengin.qa@gmail.com", "PAS123Sid.!");
        loginPage.pushSignInButton();

        String errorMessage = loginPage.getLoginErrorMessage();
        Assert.assertTrue(errorMessage.contains(expectedErrorMessage));
    }
}
