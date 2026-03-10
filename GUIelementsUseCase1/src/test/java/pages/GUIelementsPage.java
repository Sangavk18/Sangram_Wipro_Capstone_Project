package pages;

import utils.WaitUtil;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class GUIelementsPage {

    WebDriver driver;

    public GUIelementsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="name")
    WebElement name;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="phone")
    WebElement phone;

    @FindBy(id="textarea")
    WebElement address;

    @FindBy(id="male")
    WebElement maleRadio;

    @FindBy(id="monday")
    WebElement monday;

    @FindBy(id="country")
    WebElement country;

    @FindBy(id="colors")
    WebElement colors;

    @FindBy(id="datepicker")
    WebElement datepicker;

    @FindBy(xpath="//button[contains(text(),'Alert')]")
    WebElement alertBtn;

    @FindBy(id="draggable")
    WebElement drag;

    @FindBy(id="droppable")
    WebElement drop;

    public void fillForm()
    {
        WaitUtil.waitforElement(driver,name);

        name.sendKeys("Sangram");
        email.sendKeys("sangram@gmail.com");
        phone.sendKeys("9999999999");
        address.sendKeys("Mumbai India");
    }

    public void selectGender()
    {
        maleRadio.click();
    }

    public void selectDay()
    {
        monday.click();
    }

    public void selectCountry()
    {
        Select s = new Select(country);
        s.selectByVisibleText("India");
    }

    public void selectColor()
    {
        Select s = new Select(colors);
        s.selectByIndex(1);
    }

    public void selectDate()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", datepicker);

        datepicker.clear();
        datepicker.sendKeys("06/01/2026");
    }

    public void handleAlert()
    {
        alertBtn.click();
        driver.switchTo().alert().accept();
    }

    public void dragDrop()
    {
        Actions act = new Actions(driver);
        act.dragAndDrop(drag, drop).perform();
    }
}