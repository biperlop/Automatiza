package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.GeneralSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;


public class GeneralDefinitions {

    @Steps
    GeneralSteps generalSteps;

    @Given("El cliente visita pagina principal")
    public void queUnClienteVisitaPaginaPrincipal() {
        generalSteps.abrirPagina();
    }

    @And("el cliente ingresa un usuario as {username}")
    public void clienteIngresaUsuario(String username){generalSteps.ingresarUsuario(username);}

    @And("el cliente ingresa una clave as {password}")
    public void clienteIngresaClave(String password){generalSteps.ingresarClave(password);}

    @And("el cliente hace click en boton 'Login'")
    public void clicLogin(){generalSteps.clicLogin();}

    @Then("el cliente inicia sesion y visualiza la pagina de inventario")
    public void elUsuarioVisualizaPagina() {
        generalSteps.validarCarrito();
    }

    @Given("Estoy en la pagina de productos")
    public void elUsuarioPuedeVerCarrito() {
        generalSteps.validarCarrito();
    }

    @And("el cliente ingresa producto as {product}")
    public void clienteIngresaProducto(String product){generalSteps.ingresarProducto(product);}

    @And("cliente presiona boton 'buscar'")
    public void clicBuscar(){generalSteps.clicBuscar();}

    @Then("Se muestra producto")
    public void elUsuarioVisualizaProducto() {
        generalSteps.validarProducto();
    }

    @And("el cliente selecciona producto as {product}")
    public void clienteSeleccionaProducto(String product){generalSteps.seleccionaProducto(product);}

    @Then("cliente presiona boton 'add' con producto as {productid}")
    public void clicAdd(String productid){generalSteps.clicAdd(productid);}

    @And ("el cliente selecciona ordenar 'Price (low to high)'")
    public void seleccionaLista(){generalSteps.seleccionaLista();}

    @Then ("la pagina muestra ordenados los productos")
    public void validarItem(){generalSteps.validarItem();}

    @And ("compara precio de productos menor a mayor")
    public void comparaPrecio(){generalSteps.comparaPrecio();}
}
