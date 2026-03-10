package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

    WebDriver driver;

    public FlightsPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//input[@value='Choose This Flight'])[1]")
    WebElement chooseFlightBtn;

    public void chooseFlight(){

        chooseFlightBtn.click();
    }
}