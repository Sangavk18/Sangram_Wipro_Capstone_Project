package utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // create folder if not exists
            File folder = new File("screenshots");
            if (!folder.exists()) {
                folder.mkdirs();
            }

            File dest = new File(folder + "/" + testName + ".png");

            FileHandler.copy(src, dest);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}