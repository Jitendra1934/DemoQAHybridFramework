package PageObjectModel.Elements;

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
        wait(yesRadio, driver);
        scrollToElement(yesRadio, driver);
        click(yesRadio, driver);
        wait(textSelected, driver);
        scrollToElement(textSelected, driver);
        String text = getText(textSelected, driver);
        return text;
    }
    public String clickImpBtn(){
        wait(impBtn, driver);
        scrollToElement(impBtn, driver);
        click(impBtn, driver);
        wait(textSelected, driver);
        scrollToElement(textSelected, driver);
        String text = getText(textSelected, driver);
        return text;
    }
    public String clickNoBtn(){
        wait(noBtn, driver);
        scrollToElement(noBtn, driver);
        click(noBtn, driver);
        wait(textSelected, driver);
        scrollToElement(textSelected, driver);
        String text = getText(textSelected,driver);
        return text;
    }



}
