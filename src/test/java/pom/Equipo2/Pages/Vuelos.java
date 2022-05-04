package pom.Equipo2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Equipo2.Base.SeleniumBasePage;

public class Vuelos extends SeleniumBasePage {
    public Vuelos(WebDriver driver) {super(driver);}

     By vuelo = By.xpath("//a[@class=\"shifu-3-button-circle FLIGHTS paint-circle \"]");
     By multidestino = By.xpath("//span[@class=\"sbox-3-radio -md sbox-radio-button -ml5\"][2]");
     By soloIda= By.xpath("//span[@class=\"sbox-3-radio -md sbox-radio-button -ml5\"][1]");
     By origen= By.xpath("//input[@placeholder=\"Ingresa desde dónde viajas\"]");
     By destino= By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]");
     By resultado=By.xpath("//span[@class=\"item-text\"]");
     By sinFecha= By.xpath("//i[@class=\"checkbox-check sbox-3-icon-checkmark -mr1 sbox-ui-icon\"]");
     By buscar= By.xpath("//div[@class=\"sbox-button-container\"]");
     By siguiente= By.xpath("//div[@class=\"container-next-step -eva-3-bold text-next -eva-3-pt-sm -eva-3-pr-sm -eva-3-pb-sm -eva-3-pl-lg\"]");
     By aceptarCookie =By.xpath("//em[@class=\"btn-text\"]");

     public void seleccionarVuelo() {
        click(vuelo);
    }
    public void mensajeCookies(){
        click(aceptarCookie);
    }
    public void seleccionarCheckboxSoloIda(){click(soloIda);}
    public void escribirOrigen(){type("Aeropuerto La Florida, La Serena, Chile",origen);}
    public void esperarresultado(){click(resultado);}
    public void escribirDestino(){type("Aeropuerto Buenos Aires Ministro Pistarini Ezeiza, Buenos Aires, Argentina",destino);}
    public void seleccionarSinFecha(){
        click(sinFecha);
    }
    public void seleccionarBuscar(){
        click(buscar);
    }
    public void seleccionarPrimeraOpcion(){click(siguiente);
    }

}


