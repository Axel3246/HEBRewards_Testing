package com.example.koopashebguest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRewardsGuestPage {
    @FindBy(css = "a[class='invit']")
    public WebElement buttonSignFormSubmit;

    public HRewardsGuestPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
