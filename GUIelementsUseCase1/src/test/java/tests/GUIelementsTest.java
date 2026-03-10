package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIelementsPage;

public class GUIelementsTest extends BaseTest {

    @Test
    public void testGUIElements()
    {

        GUIelementsPage page = new GUIelementsPage(driver);

        page.fillForm();

        page.selectGender();

        page.selectDay();

        page.selectCountry();

        page.selectColor();

        page.selectDate();

        //page.uploadFile();

        page.handleAlert();

        page.dragDrop();

        Assert.assertTrue(true);

    }

}