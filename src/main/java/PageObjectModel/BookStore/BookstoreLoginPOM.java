package PageObjectModel.BookStore;

import Base.CommenToAllPages;
import org.apache.xmlbeans.impl.values.JavaStringHolder;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookstoreLoginPOM  extends CommenToAllPages {

    WebDriver driver;

    public BookstoreLoginPOM(WebDriver driver){
        this.driver=driver;
    }

    //Page Locatores
    private By bookStoreMianPage = By.xpath("//h5[text()=\"Book Store Application\"]");
    private By loginBtn = By.xpath("//span[text()=\"Login\"]");
    private By newUser = By.xpath("//button[@id=\"newUser\"]");
    private By errorMsg = By.xpath("//p[text()=\"Invalid username or password!\"]");
    private By useeName = By.xpath("//input[@id=\"userName\"]");
    private By password = By.xpath("//input[@id=\"password\"]");
    private By loginBtnClick = By.xpath("//button[@id=\"login\"]");
    private By getUserName = By.xpath("//label[@id=\"userName-value\"]");

    //Page Actions
    public String clickBookStoreApplication(){

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(bookStoreMianPage));
        WebElement element =  driver.findElement(bookStoreMianPage);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bookStoreMianPage));
        element.click();
        return driver.getCurrentUrl();
    }

    public String loginClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(loginBtn));
        WebElement element = driver.findElement(loginBtn);
        element.click();
        return driver.getCurrentUrl();
    }

    public String clickNewUser(){
        wait(newUser, driver);
        scrollToElement(newUser,driver);
        click(newUser,driver);
        String url = driver.getCurrentUrl();
        return url;
    }

    public String validLogin(String userName, String psw){
        wait(useeName, driver);
        scrollToElement(useeName,driver);
        sendKeys(useeName, userName, driver );
        wait(password, driver);
        scrollToElement(password,driver);
        sendKeys(password, psw, driver );
        wait(loginBtnClick, driver);
        scrollToElement(loginBtnClick,driver);
        click(loginBtnClick,driver);
        wait(getUserName, driver);
        return driver.getCurrentUrl();
    }

    public String inValidLogin(String userName, String psw){
        wait(useeName, driver);
        scrollToElement(useeName,driver);
        sendKeys(useeName, userName, driver );
        wait(password, driver);
        scrollToElement(password,driver);
        sendKeys(password, psw, driver );
        wait(loginBtnClick, driver);
        scrollToElement(loginBtnClick,driver);
        click(loginBtnClick,driver);
        wait(errorMsg, driver);
        scrollToElement(errorMsg,driver);
        String erroeText = getText(errorMsg, driver);
        return erroeText;
    }

    public String getUserName(){
        String userNameText = getText(getUserName, driver);
        return userNameText;
    }

}
