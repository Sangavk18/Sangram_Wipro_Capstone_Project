package listeners;

import base.BaseTest;
import utils.ScreenshotUtil;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result){

        ScreenshotUtil.captureScreenshot(BaseTest.driver,result.getName());
    }
}