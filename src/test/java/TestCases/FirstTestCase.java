package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    public void testCase() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");



    }
}
