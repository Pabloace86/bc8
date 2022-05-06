package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.CarritoDeComprasPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CarritoDeComprasSteps {

    CarritoDeComprasPage carrito;

    @Given("que estoy en la url {string}")
    public void que_estoy_en_la_url(String url) {
        carrito = new CarritoDeComprasPage(DriverFactory.getDriver());
        carrito.irAURLFarmacia(url);
    }

    @When("presiono el boton Agregar al Carrito")
    public void presiono_el_boton_agregar_al_carrito() {
        carrito.clickBtnAgregarCarrito();
    }

    @Then("se debe agregar correctamente el producto al carrito")
    public void se_debe_agregar_correctamente_el_producto_al_carrito() {
        Assert.assertTrue(carrito.validarMensajeIngresoProductoEnCarrito().contains("Se agreg"));
    }

    @Then("ver el carrito de compra en pantalla")
    public void ver_el_carrito_de_compra_en_pantalla() {
        carrito.irACarritoCompras();
    }

    @Given("que el cliente está el en carrito de compras con al menos {int} producto")
    public void que_el_cliente_está_el_en_carrito_de_compras_con_al_menos_producto(Integer int1) {
        System.out.println("checkout-connect");
    }

    @When("el cliente aumenta la cantidad a pedir del producto a un número mayor de {int}")
    public void el_cliente_aumenta_la_cantidad_a_pedir_del_producto_a_un_número_mayor_de(Integer int1) {
        System.out.println("checkout-connect");
    }

    @When("hace clic en {string}")
    public void hace_clic_en(String string) {
        System.out.println("checkout-connect");
    }

    @Then("se debe mostrar un popup que dice {string}")
    public void se_debe_mostrar_un_popup_que_dice(String string) {
        System.out.println("checkout-connect");
    }

    @Then("en cada artículo que esté asociado a un producto con receta médica debe aparecer un mensaje de alerta {string}")
    public void en_cada_artículo_que_esté_asociado_a_un_producto_con_receta_médica_debe_aparecer_un_mensaje_de_alerta(String string) {
        System.out.println("checkout-connect");
    }

    @When("el cliente introduce un número de tarjeta CMR inválido")
    public void el_cliente_introduce_un_número_de_tarjeta_cmr_inválido() {
        System.out.println("checkout-connect");
    }

    @Then("se despliega un mensaje de error en el carrito que dice {string}")
    public void se_despliega_un_mensaje_de_error_en_el_carrito_que_dice(String string) {
        System.out.println("checkout-connect");
    }
}
