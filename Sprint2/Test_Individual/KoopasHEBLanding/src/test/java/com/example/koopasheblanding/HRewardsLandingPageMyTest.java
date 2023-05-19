package com.example.koopasheblanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HRewardsLandingPageMyTest extends MyTest{
    private HRewardsLandingPage hRewardsLandingPage;

    @BeforeMethod
    public void setUp() {
        super.setUpCustom("https://hebrewards.vercel.app");
        hRewardsLandingPage = new HRewardsLandingPage(this.driver);
    }

    @Test
    public void NavigateSuc() {
        hRewardsLandingPage.imageMapp.click();
        WebElement navigated = driver.findElement(By.cssSelector("h3[class*='MuiTypography-h3']"));
        assertEquals(navigated.getText(), "¡Elige tu sucursal preferida!");
    }

    @Test
    public void NavigateDine() {
        hRewardsLandingPage.linkDineDash.click();
        WebElement navigated = driver.findElement(By.cssSelector("h4[class='MuiTypography-root MuiTypography-h4 css-3d6ecr']"));
        assertEquals(navigated.getText(), "Dine n' Dash!");
    }

    @Test
    public void NavigateHeb() {
        hRewardsLandingPage.linkExploraHeb.click();
        WebElement navigated = driver.findElement(By.cssSelector("h4[class*='MuiTypography-h4']"));
        assertEquals(navigated.getText(), "Filtra tu busqueda");
    }

}
