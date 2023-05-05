package com.example.koopashebguest;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// url = http://localhost:5181/login
public class HRewardsGuestPageMyTest extends MyTest{

    private HRewardsGuestPage hRewardsGuestPage;

    @BeforeMethod
    public void setUp()
    {
        super.setUpCustom("https://hebrewards.vercel.app/login");
        hRewardsGuestPage = new HRewardsGuestPage(driver);
    }

    /* ===========================================
    1. Selecciónar el boton de "iniciar sesión como invitado"
   =========================================== */

    @Test
    public void invitado()
    {
        hRewardsGuestPage.buttonSignFormSubmit.click();

        WebElement buttonSignOut = driver.findElement(By.cssSelector("button[class$='signout']"));
        assertEquals(buttonSignOut.getText(), "Sign out");
    }
}
