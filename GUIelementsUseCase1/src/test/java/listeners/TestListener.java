package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.ScreenshotUtil;
import base.BaseTest;

public class TestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result)
    {

        String testName = result.getName();

        ScreenshotUtil.captureScreenshot(driver, testName);

        System.out.println("Screenshot captured for failed test: " + testName);

    }

}