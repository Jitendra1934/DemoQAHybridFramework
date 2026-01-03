package Base;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommenToAllPages {

    public void alertWait(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
    }
//    public void frameWait(By by, WebDriver driver){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
//    }
    public void wait(By by, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by,WebDriver driver) {
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String text, WebDriver driver) {
        driver.findElement(by).sendKeys(text);
    }

    public String getText(By by, WebDriver driver){
        return driver.findElement(by).getText();
    }

    public void rightClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        // wait until element is visible & clickable
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions action = new Actions(driver);
        action.moveToElement(element).contextClick().build().perform();
    }
    public void doubleClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Actions action = new Actions(driver);
        action.moveToElement(element).doubleClick().build().perform();
    }

    public void scrollToElement(By by, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
    }

    public String enabled(By by, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
        if(driver.findElement(by).isEnabled()){
          return  "btn is enabled and clicked";
        }
        return "failed";
    }

    public void selected(By by, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
        driver.findElement(by).click();
    }

    public void calenderDropDownSelect(By by , WebDriver driver, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public void clickEnter(By by, WebDriver driver){
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    public void dropDownHandler(By stateDD, By selectSate, By cityDD, By selectCity, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateDD));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(stateDD));
        driver.findElement(stateDD).click();
        driver.findElement(selectSate).click();
        driver.findElement(cityDD).click();
        driver.findElement(selectCity).click();
    }
}
