package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}