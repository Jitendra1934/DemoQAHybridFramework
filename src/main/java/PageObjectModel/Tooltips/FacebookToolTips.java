package PageObjectModel.Tooltips;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookToolTips extends CommenToAllPages {

    WebDriver driver;

    public FacebookToolTips(WebDriver driver){
        this.driver=driver;
    }

    private By signUpToolTip = By.linkText("Sign up");

    public String getToolTip(){
        scrollToElement(signUpToolTip, driver);
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(signUpToolTip)).perform();
        String tooltip = driver.findElement(signUpToolTip).getAttribute("title");
        return tooltip;
    }
}
