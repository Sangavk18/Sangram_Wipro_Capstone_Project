package tests;

import base.BaseTest;
import listeners.TestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.FlightsPage;
import pages.PurchasePage;

@Listeners(TestListener.class)

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlightTest(){

        HomePage home = new HomePage(driver);
        home.searchFlights();

        FlightsPage flights = new FlightsPage(driver);
        flights.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.purchaseFlight();

        Assert.assertTrue(driver.getPageSource().contains("Thank you for your purchase"));
    }
}