package com.example.hrewardsproducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRewardsListaProductos {
    @FindBy(css = "input[class^='MuiInputBase-input']")
    public WebElement inputSearch;

    @FindBy(css = "select[id='producto']")
    public WebElement selectDepartamento;

    @FindBy(css = "option[value='Farmacia']")
    public WebElement optionFarmacia;

    @FindBy(css = "select[id='ofertas']")
    public WebElement selectOfertas;

    @FindBy(css = "option[value='R']")
    public WebElement optionTodasLasOfertas;

    

    public HRewardsListaProductos(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
