import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class CheckClass {

    @Test
    public void tc(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"stateCity-wrapper\"]/div[2]/div")));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement((By.xpath("//div[text()=\"Select State\"]"))));
        WebElement  stateDropDown = driver.findElement(By.xpath("//div[text()=\"Select State\"]"));
        stateDropDown.click();
        WebElement  selectSate = driver.findElement(By.xpath("//div[text()=\"Haryana\"]"));
        selectSate.click();
        WebElement  cityDropDown = driver.findElement(By.xpath("//div[text()=\"Select City\"]"));
        cityDropDown.click();
        WebElement  selectCity = driver.findElement(By.xpath("//div[text()=\"Karnal\"]"));
        selectCity.click();




    }
}
