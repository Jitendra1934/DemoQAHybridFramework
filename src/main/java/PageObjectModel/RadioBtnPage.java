package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RadioBtnPage extends CommenToAllPages {

    WebDriver driver;

    public RadioBtnPage(WebDriver driver){
        this.driver=driver;
    }

    //page locatores
    private By yesRadio = By.xpath("//label[@for=\"yesRadio\"]");
    private By impBtn = By.xpath("//label[@for=\"impressiveRadio\"]");
    private By noBtn = By.xpath("//label[@for=\"noRadio\"]");
    private By textSelected = By.xpath("//span[@class=\"text-success\"]");


    //page Action
    public String clickYesBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(yesRadio));
        click(yesRadio, driver);
        String text = getText(textSelected, driver);
        return text;
    }
    public String clickImpBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(impBtn));
        click(impBtn, driver);
        String text = getText(textSelected, driver);
        return text;
    }
    public String clickNoBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(/*"arguments[0].scrollIntoView(true);", driver.findElement(noBtn)*/ "window,scrollBy(0,350)");
        System.out.println("beore method called");
       click(noBtn, driver);
        System.out.println("After the execution");
        String text = getText(textSelected,driver);
        return text;
    }



}
