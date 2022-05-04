package pom.Equipo2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Equipo2.Base.SeleniumBasePage;

public class Paquetes extends SeleniumBasePage {
    public Paquetes(WebDriver driver) {
        super(driver);
    }

    By swithTodaviaNoHeDecididoFecha = By.xpath("//label[@class=\"switch-label sbox-switch-container\"]");
    By botonPaquetes = By.xpath("//a[@title=\"Paquetes\"]");
    By botonVueloAlojamiento = By.xpath("//input[@value=\"vh\"]");
    By botonVuelos2Alojamientos = By.xpath("//input[@class=\"sbox-bundle-input sbox-radio-vhh sbox-radio-selected-box\"]");
    By divOrigen = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-origin sbox-primary sbox-places-first sbox-origin-container places-inline\"]");
    By divDestino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-destination sbox-secondary sbox-places-second places-inline\"]");
    By desplegable = By.xpath("//ul[@class=\"ac-group-items\"]");
    By divHabitaciones = By.xpath("//div[@class=\"sbox-distri-container\"]");
    By botonMenosHabitaciones = By.xpath("//a[@class=\"steppers-icon-left sbox-3-icon-minus\"]");
    By botonBuscar = By.xpath("//em[@class=\"btn-text\" and text()=\"Buscar\"]");
    By paqueteSantiagoChile = By.xpath("//div[@class=\"offer-card-content\"][1]");
    By contenedorFechaIda = By.xpath("//div[@class=\"sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-dates-input sbox-checkin-container sbox-datein-container\"]");
    By fechaIda10del05 = By.xpath("(//div[@data-month=\"2022-05\"] //descendant:: div[@class=\"_dpmg2--dates\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available\"] //descendant:: span[text()=\"10\"])[3]");
    By fechaVuelta20del05 = By.xpath("//div[@data-month=\"2022-05\"] //descendant:: div[@class=\"_dpmg2--dates\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available _dpmg2--nights-tooltip\"] //descendant:: span[text()=\"20\"]");
    By contenedor10del05 = By.xpath("//div[@class=\"_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show\"] //descendant:: div[@data-month=\"2022-05\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available\"] //descendant:: span[text()=\"10\"]");
    By contenedorGeneralFechas = By.xpath("//div[@class=\"_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show\"]");
    By contenedor20del05 = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-7 _dpmg2--has-start-range _dpmg2--month-active\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available _dpmg2--nights-tooltip\"] //descendant:: span[text()=\"20\"]");
    By fechaHastaAlojamiento = By.xpath("//div[@class=\"input-container sbox-hotel-first-date-end-input-container\"]");
    By contenedor19de05 = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-7 _dpmg2--has-start-range _dpmg2--has-limit-date _dpmg2--month-active\"] //descendant:: div[@class=\"_dpmg2--dates\"] //descendant::  span[text()=\"19\"]");
    By segundoDestino = By.xpath("//div[@class=\"input-container\"] //descendant:: input[@class=\"input-tag sbox-main-focus sbox-hotel-second-destination sbox-primary undefined\"] ");
    By desplegableSegundoDestino = By.xpath("//div[@class=\"ac-group-title-container\"]");
    By botonContinuarATC04 = By.xpath("//span[@class=\"fare-container fare-container-TOTAL_FARE fare-container-CL fare-HOTELS -has-pricing-points\"] //descendant:: a[@class=\"-md eva-3-btn -primary\"]");
    By mostrarOpcionesAvanzadas = By.xpath("//input[@class=\"sbox-advanced-options\"]");
    By checkboxAlojamientoOtraCiudad = By.xpath("//label[@class=\"checkbox-label sbox-hotel-another-city-label\"]");
    By destinoNuevaCiudada = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-hotel-another-city sbox-primary undefined attr\"]");
    By fechaDesde = By.xpath("//input[@class=\"input-tag sbox-partial-stay-checkin-date\"]");
    By fecha01de05 = By.xpath("/html/body/div[6]/div/div[5]/div[2]/div[4]/span[2]");
    By fecha04de05 = By.xpath("/html/body/div[6]/div/div[5]/div[2]/div[4]/span[4]");
    By fecha25de05 = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-7 _dpmg2--has-start-range _dpmg2--month-active\"] //descendant:: div[@class=\"_dpmg2--dates\"] //descendant:: span[text()=\"25\"]");
    By ciudadesDestinoDos = By.xpath("//div[@class=\"ac-group-title-container\"]");
    By checkbox2 = By.xpath("//label[@class=\"checkbox-label\"]");
    By vistaMapaXP = By.xpath("//em[text()=\"Vista Mapa\"]");
    By seleccionHotel = By.xpath("(//div[@class=\"eva-3-marker -eva-3-shadow-1 -eva-3-index-3\"])[1]");
    By botonVerViaje = By.xpath("(//a[@class=\"button -md -eva-3-ml-md eva-3-btn-ghost\"])[1]");

    By paquete = By.xpath("//i[@title=\"Paquetes\"]");
    By vueloAlojamiento= By.xpath("//input[@class=\"sbox-bundle-input sbox-radio-vh sbox-radio-selected-box\"]");
    By origen= By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-origin sbox-primary sbox-places-first sbox-origin-container places-inline\"]\n");
    By destino= By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-destination sbox-secondary sbox-places-second places-inline\"]");
    By resultado=By.xpath("//span[@class=\"item-text\"]");
    By fechaIda= By.xpath("//input[@class=\"input-tag sbox-checkin-date\"]");
    By seleccionIda=By.xpath("//div[@class=\"_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show\"] //descendant:: div[@data-month=\"2022-05\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available\"] //descendant:: span[text()=\"10\"]");
    By aceptarCookie =By.xpath("//em[@class=\"btn-text\"]");
    By destinoDos = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-hotel-another-city sbox-primary undefined attr\"]");
    By paqueteMarDelPlata = By.xpath("(//button[@class=\"eva-3-btn -md -primary -eva-3-fwidth\"])[1]");
    By paqueteSantiagoChile2 = By.xpath("//button[@class=\"eva-3-btn -md -primary -eva-3-fwidth\"]");





        public void seleccionarPaquete(){click(paquete);}
        public void mensajeCookies(){click(aceptarCookie);}
        public void seleccionarVueloMasAlojamiento(){click(vueloAlojamiento);}
        public void escribirOrigen(){type("Chile",origen);}
        public void esperarresultado(){click(resultado);}
        public void escribirDestino(){type(" Buenos Aires ", destino);}
        public void seleccionarIda(){click(fechaIda10del05 );}
        public void seleccionarFechaVuelta(){click(fechaVuelta20del05);}
        public void seleccionarOpcionesAvanzadas(){click(mostrarOpcionesAvanzadas);}
        public void seleccionarAlojamientoOtraCiudad(){click(checkboxAlojamientoOtraCiudad);}
        public void seleccionarDestino2(){type("Mar del Plata, Buenos Aires, Argentina",destinoDos);}
        public void seleccionarBuscar(){click(botonBuscar);}






}
