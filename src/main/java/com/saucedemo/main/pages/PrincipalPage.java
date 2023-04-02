package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.UI;
@DefaultUrl("https://www.saucedemo.com/")
public class PrincipalPage extends PageObject {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement usernameElem;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordElem;

    @FindBy(xpath = "//a[@id='buscar']")
    private WebElement buscarELem;

    @FindBy(xpath = "//input[@value='LOGIN']")
    private WebElement loginElem;

    @FindBy(xpath = "//input[@value='BUSCAR']")
    private WebElement buscarElem;
    @FindBy(className = "inventory_item_name")
    private WebElement productELem;

    public void clickLogin()
    {
        loginElem.click();
    }
    public void clave(String username)
    {
        usernameElem.click();
        usernameElem.sendKeys(username);
    }

    public void usuario(String password)
    {
        passwordElem.click();
        passwordElem.sendKeys(password);
    }

    public String obtenerNombreCarrito() {
        WebElement elemento = getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack"));
        return elemento.getText();
    }

    public void ingresaProducto(String producto)
    {
        buscarELem.click(); //No existe elemento buscar se deja como referencia
        buscarELem.sendKeys(producto);
    }

    public void clickBuscar()
    {
        buscarElem.click();
    }

    public String obtenerNombreProducto() {
        WebElement elemento = getDriver().findElement(By.id("item_4_title_link"));
        return elemento.getText();
    }

    public void seleccionaProducto(String producto)
    {
        productELem.click(); //No existe elemento buscar se deja como referencia
    }

    public void clickAdd(String productid)
    {
        WebElement elemento = getDriver().findElement(By.id("add-to-cart-"+productid));
        elemento.click();
    }

    public void seleccionarLista()
    {
        WebElement elemento = getDriver().findElement(By.className("active_option"));
        var selectElement = new SelectElement(elemento);
        selectElement.SelectByValue(productid);
    }

    public String validarItem(String productid)
    {
        WebElement elemento = getDriver().findElement(By.id("productid"));
        return elemento.getText();
    }

    public String comparaPrecio()
    {
        WebElement elemento = getDriver().findElement(By.id("item_2_title_link"));
        WebElement elemento2 = getDriver().findElement(By.id("item_0_title_link"));
        WebElement elemento3 = getDriver().findElement(By.id("item_1_title_link"));

       Integer precio1, precio2, precio3;
       precio1 = Integer.valueOf(elemento.getText().toString());
        precio2 = Integer.valueOf(elemento.getText().toString());
        precio3 = Integer.valueOf(elemento.getText().toString());

        if (precio1 > precio2){
            if (precio2 > precio3){
                return "Ordenados correctamente";
            }
        }

        return "Orden incorrecto";
    }

}
