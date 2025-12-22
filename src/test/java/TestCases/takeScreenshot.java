package TestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class takeScreenshot extends CommenToAllTestCases {

    @Test
    public void takeScreenshot() throws IOException {
        DriverManager.getDriver().get("https://google.com");
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+File.separator+"screenshot01");
        FileUtils.copyFile(src, dest);

    }

}
