package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotUtils {

    public static String takeScreenshot(WebDriver driver, String testName) {

        String projectPath = System.getProperty("user.dir");
        String screenshotDir = projectPath + File.separator + "screenshots";
        File folder = new File(screenshotDir);
        try {
            // This will create directory automatically if not exists
            FileUtils.forceMkdir(folder);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File(folder, testName + "_" + timestamp + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());

            return dest.getAbsolutePath();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}