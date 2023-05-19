package com.example.koopas_heb_dinendash;

import org.testng.annotations.*;
import static org.testng.Assert.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
public class HRewardsDNDPage1MyTest extends MyTest {
    private HRewardsDNDPage1 hRewardsDNDPage1;

    @BeforeMethod
    public void setUp()
    {
        super.setUpCustom("https://hebrewards.vercel.app/recetas");
        hRewardsDNDPage1 = new HRewardsDNDPage1(driver);
    }

    /* ==================================================
    Prueba #9
    Precondiciones: El usuario se encuentra en la sección de recetas
    Pasos:
    1. Se da clic a cualquier receta
    ================================================== */
    @Test
    public void clickFirstPage()
    {
        hRewardsDNDPage1.buttonPastelCremosoColada.click();
        assertEquals(hRewardsDNDPage1.pReceta.getText(), "Pastel Cremoso Piña Colada 40oz");
    }

    /* ==================================================
        Prueba #10
        Precondiciones: El usuario se encuentra en la sección de recetas
        Pasos:
        1. Se da clic en el botón de flecha a la derecha en el menú de paginación
        2. Se da clic a cualquier receta
        ================================================== */
    @Test
    public void clickSecondPage()
    {
        hRewardsDNDPage1.liNext.click();
        hRewardsDNDPage1.buttonPayLimonMerengue.click();
        assertEquals(hRewardsDNDPage1.pReceta.getText(), "Pay Limon Merengue 1pz");
    }

}
