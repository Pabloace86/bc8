package automationcraft.testcreation.google.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultPage extends SeleniumBase {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    By primerLink = By.xpath("//div[@class=\"s6JM6d\"]");
            //("(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[5]");

    boolean result= false;
    public void validarPrimerLink(String string){
        scrollear(primerLink);
        WebElement link= findElement(primerLink);
        if(link.getText().contains(string)){
            result=true;
        }
        Assert.assertTrue(result);
    }
    public void selectlink1() {
        click(primerLink);
    }
}
