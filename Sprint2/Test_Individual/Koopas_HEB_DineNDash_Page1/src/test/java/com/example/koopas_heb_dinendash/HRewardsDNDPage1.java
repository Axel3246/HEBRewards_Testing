package com.example.koopas_heb_dinendash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HRewardsDNDPage1 {
    @FindBy(css = "html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > button:nth-of-type(2)")
    public WebElement buttonPastelCremosoColada;

    @FindBy(css = "li[class='next']")
    public WebElement liNext;

    @FindBy(css = "button")
    public WebElement buttonPayLimonMerengue;

    @FindBy(css = "html > body > div > div > div > div:nth-of-type(1) > div > p")
    public WebElement pReceta;

    

    public HRewardsDNDPage1(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
