package com.example.koopasheblanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRewardsLandingPage {
    @FindBy(css = "img[class='mapp']")
    public WebElement imageMapp;

    @FindBy(css = "html > body > div > div > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > a")
    public WebElement linkDineDash;

    @FindBy(css = "html > body > div > div > div > div > div:nth-of-type(3) > div > div:nth-of-type(2) > a")
    public WebElement linkExploraHeb;

    
    
    public HRewardsLandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
