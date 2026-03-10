package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id="customer.firstName")
    WebElement firstName;

    @FindBy(id="customer.lastName")
    WebElement lastName;

    @FindBy(id="customer.address.street")
    WebElement address;

    @FindBy(id="customer.address.city")
    WebElement city;

    @FindBy(id="customer.address.state")
    WebElement state;

    @FindBy(id="customer.address.zipCode")
    WebElement zip;

    @FindBy(id="customer.phoneNumber")
    WebElement phone;

    @FindBy(id="customer.ssn")
    WebElement ssn;

    @FindBy(id="customer.username")
    WebElement username;

    @FindBy(id="customer.password")
    WebElement password;

    @FindBy(id="repeatedPassword")
    WebElement confirmPassword;

    @FindBy(xpath="//input[@value='Register']")
    WebElement registerBtn;

    public void registerUser(String user,String pass){

        wait.until(ExpectedConditions.visibilityOf(firstName));

        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        address.sendKeys("123 Street");
        city.sendKeys("NY");
        state.sendKeys("NY");
        zip.sendKeys("10001");
        phone.sendKeys("9876543210");
        ssn.sendKeys("123456789");

        username.sendKeys(user);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);

        registerBtn.click();
    }
}