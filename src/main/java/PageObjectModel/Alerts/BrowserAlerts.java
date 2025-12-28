package PageObjectModel.Alerts;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class BrowserAlerts extends CommenToAllPages {

    WebDriver driver;

    public BrowserAlerts(WebDriver driver){
        this.driver = driver;
    }

    //page actions
    private By browserWindowsBtn = By.xpath("//span[text()=\"Browser Windows\"]");
    private By newTabBtn = By.xpath("//button[@id = \"tabButton\"]");
    private By newWindow = By.xpath("//button[@id = \"windowButton\"]");
    private By newMsgWindowBtn = By.xpath("//button[@id = \"messageWindowButton\"]");
    //Page Actions
    public String clickBrowserWindowsBtn(){
        click(browserWindowsBtn, driver);
        return driver.getCurrentUrl();
    }

    public String clickNewTab(){
        click(newTabBtn, driver);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        if (windows.size() > 1) {
            driver.switchTo().window(windows.get(1));
        }
        return driver.getCurrentUrl();
    }
    public String clickNewWindow(){
        click(newWindow, driver);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        if (windows.size() > 1) {
            driver.switchTo().window(windows.get(1));
        }
        return driver.getCurrentUrl();
    }

    public String clickNewMsgWindow(){
        click(newMsgWindowBtn, driver);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        if (windows.size() > 1) {
           return "Window is Opened";
        }
        return "Window isn't opened";
    }

}
