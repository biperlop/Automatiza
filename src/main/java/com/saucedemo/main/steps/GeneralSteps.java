package com.saucedemo.main.steps;

import com.saucedemo.main.pages.PrincipalPage;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GeneralSteps {

    @ManagedPages
    PrincipalPage principalPage;

    @Step
    public void abrirPagina() {
        principalPage.open();
    }

    @Step
    public void ingresarUsuario(String usuario){principalPage.usuario(usuario);}

    @Step
    public void ingresarClave(String clave){principalPage.clave(clave);}

    @Step
    public void clicLogin(){principalPage.clickLogin();}

    @Step
    public void validarCarrito() {
        assertThat("Add to cart", equalTo(principalPage.obtenerNombreCarrito()));
        System.out.println(principalPage.obtenerNombreCarrito());
    }

    @Step
    public void ingresarProducto(String product){principalPage.ingresaProducto(product);}

    @Step
    public void clicBuscar(){principalPage.clickBuscar();}

    @Step
    public void validarProducto() {
        assertThat("Sauce Labs Backpack", equalTo(principalPage.obtenerNombreProducto()));
        System.out.println(principalPage.obtenerNombreProducto());
    }

    @Step
    public void seleccionaProducto(String product){principalPage.seleccionaProducto(product);}

    @Step
    public void clicAdd(String productid){principalPage.clickAdd(productid);}

    @Step
    public void seleccionaLista(){principalPage.seleccionarLista();}
    @Step
    public void validarItem(){
        assertThat("Sauce Labs Onesie", equalTo(principalPage.obtenerNombreProducto()));
        System.out.println(principalPage.obtenerNombreProducto());
    }
    @Step
    public void comparaPrecio(){
        System.out.println(principalPage.comparaPrecio());
    }

}
