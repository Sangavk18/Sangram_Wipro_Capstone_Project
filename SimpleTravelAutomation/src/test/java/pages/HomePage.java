package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="fromPort")
    WebElement departureCity;

    @FindBy(name="toPort")
    WebElement destinationCity;

    @FindBy(css="input[type='submit']")
    WebElement findFlightsBtn;

    public void searchFlights(){

        Select dep = new Select(departureCity);
        dep.selectByIndex(1);

        Select dest = new Select(destinationCity);
        dest.selectByIndex(2);

        findFlightsBtn.click();
    }
}