package com.example.koopasheblogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://localhost:5181/login
public class HRewardsLoginPage {
    @FindBy(css = "input[id='email']")
    public WebElement inputSessionKey;

    @FindBy(css = "input[id='password']")
    public WebElement inputSessionPassword;

    @FindBy(css = "button[class*='MuiButton-fullWidth']")
    public WebElement buttonSignFormSubmit;

    public HRewardsLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


}
