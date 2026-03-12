package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
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
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    WebDriver driver1 = new ChromeDriver(options);
                    setDriver(driver1);
                    break;
                }
                case "edge": {

                    System.setProperty("webdriver.edge.driver",
                            System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");

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