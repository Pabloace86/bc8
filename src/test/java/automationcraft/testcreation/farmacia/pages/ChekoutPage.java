package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChekoutPage extends SeleniumBase {
    public ChekoutPage(WebDriver driver) {
        super(driver);
    }
    //atributos
    By cantdeProducto=By.xpath("//input [@id=\"cart-3413786-qty\"]");
    By actualizarCompra= By.xpath("(//button[@name=\"update_cart_action\"])[2]");
    By mensajePopup= By.xpath("(//div[@class=\"modal-content\"])[4]");
    By contenedorNumeroDeTarjeta= By.xpath("//input[@maxlength=\"6\"]");
    By aplicarTarjeta= By.id("send-cmr-coupon");

    //funcionalidades

    public void irAChekout(String url){
        goToUrl(url);
    }
    public void irACarritodeCompra(String url){
        goToUrl(url);
    }
    public void ingresarCantidadDeProducto(){
        type("11",cantdeProducto);
    }

    public String validarMensajeIngresoProductoEnCarrito(){

        if (isDisplayed(mensajePopup)) {
            return getText(mensajePopup;
        }

    public void actualizarCompra(){
        click(actualizarCompra);}

    }

}







