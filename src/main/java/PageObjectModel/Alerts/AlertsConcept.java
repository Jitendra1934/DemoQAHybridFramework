package PageObjectModel.Alerts;

import Base.CommenToAllPages;
import com.aventstack.extentreports.model.ScreenCapture;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsConcept extends CommenToAllPages {

    public WebDriver driver;

    public AlertsConcept(WebDriver driver){
        this.driver=driver;
    }

    //page Locators
    private By alertBtn = By.xpath("//h5[text()=\"Alerts, Frame & Windows\"]");
    private By alertMenuBtn = By.xpath("//span[text()=\"Alerts\"]");
    private By alert = By.xpath("//button[@id = \"alertButton\"]");
    private By timeAlertButton = By.xpath("//button[@id = \"timerAlertButton\"]");
    private By confirmBtnAlert = By.xpath("//button[@id =\"confirmButton\"]");
    private By resultAlert = By.xpath("//span[@id =\"confirmResult\"]");
    private By promtBtn = By.xpath("//button[@id=\"promtButton\"]");
    private By promptResult = By.xpath("//span[@id=\"promptResult\"]");

    //Page Actions
    public String clickAlert(){
        wait(alertBtn,driver);
        scrollToElement(alertBtn,driver);
        click(alertBtn, driver);
        return driver.getCurrentUrl();
    }

    public String alertMenuBtn(){
        wait(alertMenuBtn, driver);
        scrollToElement(alertMenuBtn, driver);
        click(alertMenuBtn, driver);
        return driver.getCurrentUrl();
    }

    public String  alert(){
        wait(alert, driver);
        scrollToElement(alert, driver);
        click(alert, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        a.accept();
        return text;
    }

    public String timeAlertClick(){
        wait(timeAlertButton, driver);
        scrollToElement(timeAlertButton, driver);
        click(timeAlertButton, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        a.accept();
        return text;
    }

    public String yesAlert(){
        wait(confirmBtnAlert, driver);
        scrollToElement(confirmBtnAlert, driver);
        click(confirmBtnAlert, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        a.accept();
        wait(resultAlert, driver);
        scrollToElement(resultAlert, driver);
        String text = getText(resultAlert, driver);
        return text;
    }

    public String cancelAlert(){
        wait(confirmBtnAlert, driver);
        scrollToElement(confirmBtnAlert, driver);
        click(confirmBtnAlert, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        a.dismiss();
        wait(resultAlert, driver);
        scrollToElement(resultAlert, driver);
        String text = getText(resultAlert, driver);
        return text;
    }

    public String yesPromt(){
        wait(promtBtn, driver);
        scrollToElement(promtBtn, driver);
        click(promtBtn, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        a.sendKeys("jitendra");
        a.accept();
        wait(promptResult, driver);
        scrollToElement(promptResult, driver);
        String text = getText(promptResult, driver);
        return text;
    }
    public String cancelPromt() {
        wait(promtBtn, driver);
        scrollToElement(promtBtn, driver);
        click(promtBtn, driver);
        alertWait(driver);
        Alert a = driver.switchTo().alert();
        a.dismiss();
        return "alert cancel";
    }
}
