package com.dice.pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject<LoginPage> {
    private static final String URL = "https://www.dice.com/dashboard/login";
    private final By emailField = By.xpath("//*[@id='email']");
    private final By passwordField = By.xpath("//*[@id='password']");
    private final By signinButton = By.xpath("//button[@type='submit']");
    private final By errorMessage = By.xpath("//span[@data-automation-id='login-failure-help-message']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        getPage(URL);
    }

    public void openDummyPage() {
        getPage("https://www.amazon.com");
    }

    public void fillUpEmailAndPassword(String email, String passwrd) {
        System.out.println("Filling up email and password");
        type(email, emailField);
        type(passwrd, passwordField);
    }

    public ProfilePage pushSignInButton() {
        System.out.println("clicking on signin");
        click(signinButton);
        return new ProfilePage(driver);
    }

    public String getLoginErrorMessage() {
        waitForVisibilityOf(errorMessage,10);
        return getText(errorMessage);
    }
}
