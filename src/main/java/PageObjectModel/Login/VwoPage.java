package PageObjectModel.Login;

import Base.CommenToAllPages;
import Utilities.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class VwoPage extends CommenToAllPages {

    WebDriver driver;

    public VwoPage(WebDriver driver) {

        this.driver = driver;
    }

    //Page locatores

    private By email = By.id("login-username");
    private By password =By.id("login-password");
    private By signInButton = By.id("js-login-btn");
    private By errorTest = By.id("js-notification-box-msg");


    //Page Actions
    public String loginTestCase() throws IOException {
        wait(email, driver);
        scrollToElement(email, driver);
        sendKeys(email, PropertyReader.readKey("name"), driver);
        wait(password, driver);
        scrollToElement(password, driver);
        sendKeys(password, PropertyReader.readKey("pswd"), driver);
        wait(signInButton, driver);
        scrollToElement(signInButton, driver);
        click(signInButton, driver);
        wait(errorTest, driver);
        scrollToElement(errorTest, driver);
        String emsg = getText(errorTest, driver);
        return emsg;
    }

    public String loginFailTestCase() throws IOException {
        wait(email, driver);
        scrollToElement(email, driver);
        sendKeys(email, PropertyReader.readKey("name"), driver);
        wait(password, driver);
        scrollToElement(password, driver);
        sendKeys(password, PropertyReader.readKey("pswd"), driver);
        wait(signInButton, driver);
        scrollToElement(signInButton, driver);
        click(signInButton, driver);
        wait(errorTest, driver);
        scrollToElement(errorTest, driver);
        String emsg = getText(errorTest, driver);
        return emsg;
    }
}
