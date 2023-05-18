package com.example.koopashebregister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://localhost:5181/signup
public class HRewardsRegisterPage {
    @FindBy(css = "input[id='Nombre']")
    public WebElement inputSessionKey;

    @FindBy(css = "input[id='Apellido']")
    public WebElement inputSessionKeyTwo;

    @FindBy(css = "input[id='email']")
    public WebElement inputSessionKeyThree;

    @FindBy(css = "input[id='password']")
    public WebElement inputSessionPassword;

    @FindBy(css = "button[class*='MuiButton-root']")
    public WebElement buttonSignFormSubmit;

    public HRewardsRegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
