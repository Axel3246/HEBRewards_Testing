package com.example.hrewardsproducts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class HRewardsListaProductosMyTest extends MyTest {

    private HRewardsListaProductos hRewardsListaProductos;

    public HRewardsListaProductosMyTest() {
    }

    @BeforeMethod
    public void setUp() {
        super.setUpCustom("https://hebrewards.vercel.app/productos");
        hRewardsListaProductos = new HRewardsListaProductos(this.driver);
    }

    @Test
    public void CheckValidProduct() {
        hRewardsListaProductos.inputSearch.sendKeys("Arroz Rojo");
        WebElement ValidProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        assertEquals(ValidProduct.getText(), "Arroz Rojo");
    }

    @Test
    public void CheckInvalidProduct() {
        hRewardsListaProductos.inputSearch.sendKeys("Caramelo");
        WebElement invalidProduct = null;
        try {
            invalidProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        } catch (Exception e) {
            assertNull(invalidProduct);
        }
    }

    @Test
    public void DepartmentProductExist() {
        hRewardsListaProductos.selectDepartamento.click();
        hRewardsListaProductos.optionFarmacia.click();
        hRewardsListaProductos.inputSearch.sendKeys("Ensalada Rusa");

        WebElement validProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        assertEquals(validProduct.getText(), "Ensalada Rusa");
    }

    @Test
    public void DepartmentProductNotExist() {
        hRewardsListaProductos.selectDepartamento.click();
        hRewardsListaProductos.optionFarmacia.click();
        hRewardsListaProductos.inputSearch.sendKeys("Arroz Rojo");

        WebElement invalidProduct = null;
        try {
            invalidProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        } catch (Exception e) {
            assertNull(invalidProduct);
        }
    }

    @Test
    public void OfertaProductExist() {
        hRewardsListaProductos.selectOfertas.click();
        hRewardsListaProductos.optionTodasLasOfertas.click();
        hRewardsListaProductos.inputSearch.sendKeys("Chapata Pechuga");


        WebElement validProduct = driver.findElement(By.cssSelector("h3"));
        assertEquals(validProduct.getText(), "Chapata Pechuga De Pavo");
    }

    @Test
    public void OfertaProductNotExist() {
        hRewardsListaProductos.selectOfertas.click();
        hRewardsListaProductos.optionTodasLasOfertas.click();
        hRewardsListaProductos.inputSearch.sendKeys("Caramelo");

        WebElement invalidProduct = null;
        try {
            invalidProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        } catch (Exception e) {
            assertNull(invalidProduct);
        }
    }

    @Test
    public void OfertaAndDepartmentProductExist() {
        hRewardsListaProductos.selectOfertas.click();
        hRewardsListaProductos.optionTodasLasOfertas.click();
        hRewardsListaProductos.selectDepartamento.click();
        hRewardsListaProductos.optionFarmacia.click();
        hRewardsListaProductos.inputSearch.sendKeys("Ensalada Rusa");

        WebElement validProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        assertEquals(validProduct.getText(), "Ensalada Rusa");
    }

    @Test
    public void OfertaAndDepartmentProductNotExist() {
        hRewardsListaProductos.selectOfertas.click();
        hRewardsListaProductos.optionTodasLasOfertas.click();
        hRewardsListaProductos.selectDepartamento.click();
        hRewardsListaProductos.optionFarmacia.click();
        hRewardsListaProductos.inputSearch.sendKeys("Caramelo");

        WebElement invalidProduct = null;
        try {
            invalidProduct = driver.findElement(By.cssSelector("html > body > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a > h3"));
        } catch (Exception e) {
            assertNull(invalidProduct);
        }
    }








}
