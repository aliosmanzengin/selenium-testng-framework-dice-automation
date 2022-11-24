package com.dice.pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePageObject<ProfilePage> {

    private final By profilePicture = By.xpath("//form[@name='profilePicform']");
    private final By profileContactNameText = By.xpath("//h3[contains(@class,'personal-info') and contains(@class,'name-section')]");

    protected ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void waitForProfilePageToLoad() {
        System.out.println("waiting for profile page to load");
        waitForVisibilityOf(profilePicture);
    }

    public boolean isCorrectProfileLoaded(String correctProfileName) {
        return getText(profileContactNameText).equals(correctProfileName);
    }
}
