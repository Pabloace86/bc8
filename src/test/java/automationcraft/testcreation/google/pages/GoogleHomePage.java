package automationcraft.testcreation.google.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends SeleniumBase {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //Atributos de la pagina
    String URLHOME = "http://www.google.com";
    By searchBox = By.name("q");
    By bntK = By.xpath("(//input[@class=\"gNO89b\"])[2]");
    By esperar= By.xpath("//div[@class=\"o3j99 ikrT4e om7nvf\"]");


    //funcionalidad
    public void irAGoogleHome(){
        goToUrl(URLHOME);
    }

    public void insertarTextoEnSearchBox(String text){
        type(text,searchBox);
    }

    public void clickearBtnBusqueda(){
        click(bntK);
    }

    public void esperarResultado(){click(esperar);}


}
