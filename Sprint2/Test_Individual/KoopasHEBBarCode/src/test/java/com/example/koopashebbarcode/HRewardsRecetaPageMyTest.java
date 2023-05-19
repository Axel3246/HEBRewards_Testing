package com.example.koopashebbarcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HRewardsRecetaPageMyTest extends MyTest{
    private HRewardsRecetaPage hRewardsRecetaPage ;

    @BeforeMethod
    public void setUp() {
        super.setUpCustom("https://hebrewards.vercel.app/Recetas");
        hRewardsRecetaPage = new HRewardsRecetaPage(this.driver);
    }

    @Test
    public void NavigateSuc() {
        hRewardsRecetaPage.buttonPolloRostizadoSaborOriginal.click();
        hRewardsRecetaPage.buttonBaseIcon.click();
        hRewardsRecetaPage.inputCode.sendKeys("750489481116190");
        hRewardsRecetaPage.buttonBaseIcon.click();
        assertEquals(hRewardsRecetaPage.pPechugaPollo.getText(), "Encontrado");
    }



}
