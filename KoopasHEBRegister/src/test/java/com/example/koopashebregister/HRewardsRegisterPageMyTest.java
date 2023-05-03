package com.example.koopashebregister;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// page_url = http://localhost:5181/signup

public class HRewardsRegisterPageMyTest extends MyTest {

    private HRewardsRegisterPage hRewardsRegisterPage;

    @BeforeMethod
    public void setUp()
    {
        super.setUpCustom("http://localhost:5181/signup");
        hRewardsRegisterPage = new HRewardsRegisterPage(driver);
    }

    /* ===========================================
    1. Selecciónar el campo de nombre
    2. Introducir """"
    3. Selecciónar el campo de apellido
    4. introducir """"
    5. Seleccionar el campo de correo electrónico
    6. Introducir """"
    7. Seleccionar el campo de contraseña
    8. Introducir """"
    9. Seleccionar el botón de registro
   =========================================== */
    @Test
    public void todoVacio()
    {
        hRewardsRegisterPage.inputSessionKey.sendKeys("");
        hRewardsRegisterPage.inputSessionKeyTwo.sendKeys("");
        hRewardsRegisterPage.inputSessionKeyThree.sendKeys("");
        hRewardsRegisterPage.inputSessionPassword.sendKeys("");
        hRewardsRegisterPage.buttonSignFormSubmit.click();

        WebElement divNoMove = driver.findElement(By.cssSelector("h3[class*='MuiTypography-h3']"));
        assertEquals(divNoMove.getText(), "¡Únete a HEB Rewards!");
    }

    /* ===========================================
    1. Selecciónar el campo de nombre
    2. Introducir ""Alvin""
    3. Selecciónar el campo de apellido
    4. introducir ""Yakitori""
    5. Seleccionar el campo de correo electrónico
    6. Introducir ""elcorreo""
    7. Seleccionar el campo de contraseña
    8. Introducir ""lacontraseña""
    9. Seleccionar el botón de registro
   =========================================== */
    @Test
    public void emailNoValido()
    {
        hRewardsRegisterPage.inputSessionKey.sendKeys("Alvin");
        hRewardsRegisterPage.inputSessionKeyTwo.sendKeys("Yakitori");
        hRewardsRegisterPage.inputSessionKeyThree.sendKeys("elcorreo");
        hRewardsRegisterPage.inputSessionPassword.sendKeys("lacontraseña");
        hRewardsRegisterPage.buttonSignFormSubmit.click();

        WebElement divNoMove = driver.findElement(By.cssSelector("h3[class*='MuiTypography-h3']"));
        assertEquals(divNoMove.getText(), "¡Únete a HEB Rewards!");
    }

    /* ===========================================
    1. Selecciónar el campo de nombre
    2. Introducir ""Alvin""
    3. Selecciónar el campo de apellido
    4. introducir ""Yakitori""
    5. Seleccionar el campo de correo electrónico
    6. Introducir ""elcorreo@gmail.com""
    7. Seleccionar el campo de contraseña
    8. Introducir ""lacontraseña""
    9. Seleccionar el botón de registro
    =========================================== */
    @Test
    public void registroValido()
    {
        hRewardsRegisterPage.inputSessionKey.sendKeys("Jefferson");
        hRewardsRegisterPage.inputSessionKeyTwo.sendKeys("Yakitori");
        hRewardsRegisterPage.inputSessionKeyThree.sendKeys("elcorreo3@gmail.com");
        hRewardsRegisterPage.inputSessionPassword.sendKeys("lacontraseña");
        hRewardsRegisterPage.buttonSignFormSubmit.click();

        WebElement divUsername = driver.findElement(By.cssSelector("button[class$='signout']"));
        assertEquals(divUsername.getText(), "Sign out");
    }
}
