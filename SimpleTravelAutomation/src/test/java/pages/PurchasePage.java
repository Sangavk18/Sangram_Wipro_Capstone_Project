package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="inputName")
    WebElement name;

    @FindBy(id="address")
    WebElement address;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="state")
    WebElement state;

    @FindBy(id="zipCode")
    WebElement zip;

    @FindBy(id="creditCardNumber")
    WebElement cardNumber;

    @FindBy(id="nameOnCard")
    WebElement cardName;

    @FindBy(css="input[type='submit']")
    WebElement purchaseBtn;

    public void purchaseFlight(){

        name.sendKeys("John Doe");
        address.sendKeys("123 Street");
        city.sendKeys("NY");
        state.sendKeys("NY");
        zip.sendKeys("10001");
        cardNumber.sendKeys("1234567812345678");
        cardName.sendKeys("John Doe");

        purchaseBtn.click();
    }
}