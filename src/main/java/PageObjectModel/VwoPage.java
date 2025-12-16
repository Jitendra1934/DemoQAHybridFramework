package PageObjectModel;

import Base.CommenToAllPages;
import Utilities.PropertyReader;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class VwoPage extends CommenToAllPages {

    static WebDriver driver;

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
        visibilityOfElement(email, PropertyReader.readKey("name"));
        visibilityOfElement(password, PropertyReader.readKey("pswd"));
        visibilityOfElement(signInButton);
        String emsg = getText(errorTest);
        return emsg;
    }

    public String loginFailTestCase() throws IOException {
        visibilityOfElement(email, PropertyReader.readKey("name"));
        visibilityOfElement(password, PropertyReader.readKey("pswd"));
        visibilityOfElement(signInButton);
        String emsg = getText(errorTest);
        return emsg;
    }
}
