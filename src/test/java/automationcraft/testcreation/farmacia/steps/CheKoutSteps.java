package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.ChekoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheKoutSteps {
       ChekoutPage checkout;

    @Given("que estoy en la url {string}")
    public void que_estoy_en_la_url(String url) {
        checkout = new ChekoutPage(DriverFactory.getDriver());
        checkout.irAChekout(url);


    @When("Agrego cantidad de Productos")
    public void agrego_Cantidad_De_producto() {
        checkout.ingresarCantidadDeProducto();
    }

    @Then("se debe mostrar el Mensaje de Popup Excedido el limite de proiducto")
    public void se_debe_mostrar_correctamente_el_popup() {
        Assert.assertTrue(checkout.m().contains("se agrega"));
    }

    @Then("ver el carrito de compra en pantalla")
    public void ver_el_carrito_de_compra_en_pantalla() {
        carrito.irACarritoCompras();
    }
}
}
