package tests;

import base.BaseTest;
import listeners.TestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegisterPage;
import utils.TestDataGenerator;

import java.time.Duration;

@Listeners(TestListener.class)

public class RegisterLoginTest extends BaseTest {

    @Test
    public void registerAndLoginTest(){

        // Generate unique username
        String username = TestDataGenerator.generateUsername();
        String password = "Password123";

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerUser(username, password);

        // Wait until Welcome message appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));

        // Verify successful registration
        Assert.assertTrue(driver.getPageSource().contains("Welcome"), 
                "Registration failed - Welcome message not found");

        // Logout
        driver.findElement(By.linkText("Log Out")).click();

        // Login again
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Wait until Accounts Overview loads
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Accounts Overview")));

        // Verify login success
        Assert.assertTrue(driver.getPageSource().contains("Accounts Overview"), 
                "Login failed - Accounts Overview not visible");
    }
}