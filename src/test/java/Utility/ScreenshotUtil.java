package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            // Ensure the "screenshots" folder exists
            File screenshotDir = new File("screenshots");
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs();
            }

            // Generate timestamp to avoid overwriting files
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            // Capture screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            //  Define the destination file
            File destFile = new File("screenshots/" + screenshotName + "_" + timestamp + ".png");

            //  Save the screenshot
            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error taking screenshot: " + e.getMessage());
            throw new RuntimeException("Failed to capture screenshot", e);
        }
    }
}
