package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    public static void setUp(String browser) {
        if (driver.get() == null) {
            switch (browser.toLowerCase()) {
                case "chrome": {
                    WebDriver driver1 = new ChromeDriver();
                    setDriver(driver1);
                    break;
                }
                case "edge": {
                    WebDriver driver1 = new EdgeDriver();
                    setDriver(driver1);
                    break;
                }
                case "firefox": {
                    WebDriver driver1 = new FirefoxDriver();
                    setDriver(driver1);
                    break;
                }
            }
        }
    }

    public static void setDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}