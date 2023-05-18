package com.example.koopasheblogin;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// page_url = http://localhost:5181/login
public class HRewardsLoginPageMyTest extends MyTest {

    private HRewardsLoginPage hRewardsLoginPage;

    @BeforeMethod
    public void setUp()
    {
        super.setUpCustom("http://localhost:5181/login");
        hRewardsLoginPage = new HRewardsLoginPage(driver);
    }
    /* ===========================================
    1. Selecciónar el campo de correo electrónico
    2. Introducir """"
    3. Selecciónar el campo de contraseña
    4. introducir """"
    5. Seleccionar el botón de inicio de sesión"
    Se despliega error: ¡Email o contraseña incorrectos!
    =========================================== */
    @Test
    public void usuarioPassVacios()
    {
        hRewardsLoginPage.inputSessionKey.sendKeys("");
        hRewardsLoginPage.inputSessionPassword.sendKeys("");
        hRewardsLoginPage.buttonSignFormSubmit.click();
        
        WebElement divErrorForUsername = driver.findElement(By.cssSelector("div[class*='MuiAlert-root']"));
        assertEquals(divErrorForUsername.getText(), "¡Email o contraseña incorrectos!");
    }

    /* ===========================================
    1. Selecciónar el campo de correo electrónico
    2. Introducir ""abcde""
    3. Selecciónar el campo de contraseña
    4. introducir ""micontraseñamuysegura""
    5. Seleccionar el botón de inicio de sesión
    =========================================== */
    @Test
    public void usuarioPassIncorrectos()
    {
        hRewardsLoginPage.inputSessionKey.sendKeys("abcde");
        hRewardsLoginPage.inputSessionPassword.sendKeys("micontraseñamuysegura");
        hRewardsLoginPage.buttonSignFormSubmit.click();

        WebElement divErrorForUsername = driver.findElement(By.cssSelector("div[class*='MuiAlert-root']"));
        assertEquals(divErrorForUsername.getText(), "¡Email o contraseña incorrectos!");
    }

    /* ===========================================
    1. Selecciónar el campo de correo electrónico
    2. Introducir ""koopas@gmail.com""
    3. Selecciónar el campo de contraseña
    4. introducir ""elmejorequipo/2""
    5. Seleccionar el botón de inicio de sesión
    =========================================== */
    @Test
    public void usuarioPassNoRegistrados()
    {
        hRewardsLoginPage.inputSessionKey.sendKeys("koopas@gmail.com");
        hRewardsLoginPage.inputSessionPassword.sendKeys("elmejorequipo/2");
        hRewardsLoginPage.buttonSignFormSubmit.click();

        WebElement divErrorForUsername = driver.findElement(By.cssSelector("div[class*='MuiAlert-root']"));
        assertEquals(divErrorForUsername.getText(), "¡Email o contraseña incorrectos!");
    }

    /* ===========================================
    1. Selecciónar el campo de correo electrónico
    2. Introducir ""hola@gmail.com""
    3. Selecciónar el campo de contraseña
    4. introducir ""patapon""
    5. Seleccionar el botón de inicio de sesión
    =========================================== */
    @Test
    public void usuarioPassRegistrados()
    {
        hRewardsLoginPage.inputSessionKey.sendKeys("hola@gmail.com");
        hRewardsLoginPage.inputSessionPassword.sendKeys("patapon");
        hRewardsLoginPage.buttonSignFormSubmit.click();

        WebElement divUsername = driver.findElement(By.cssSelector("button[class$='signout']"));
        assertEquals(divUsername.getText(), "Sign out");
    }
}
