package com.example.koopashebbarcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRewardsRecetaPage {
    @FindBy(css = "html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > button:nth-of-type(1)")
    public WebElement  buttonPolloRostizadoSaborOriginal;

    @FindBy(css = "html > body > div > div > div > div:nth-of-type(2) > div > div > button:nth-of-type(1)")
    public WebElement  buttonBaseIcon;

    @FindBy(css = "input[id='code']")
    public WebElement  inputCode;

    @FindBy(css = "html > body > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div:nth-of-type(2) > p")
    public WebElement  pPechugaPollo;

    public HRewardsRecetaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}