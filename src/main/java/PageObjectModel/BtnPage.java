package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BtnPage extends CommenToAllPages {

    WebDriver driver;

    public BtnPage(WebDriver driver){
        this.driver=driver;
    }

    //page Actions
    private By dbtn = By.xpath("//button[@id=\"doubleClickBtn\"]");
    private By rbtn = By.xpath("//button[@id=\"rightClickBtn\"]");

    private By cbtn = By.id("gSOSx");
    private By dtext = By.id("doubleClickMessage");
    private By rtext = By.id("rightClickMessage");
    private By text = By.id("dynamicClickMessage");

    //Page Actions

    public String dclick(){
        doubleClick(driver, driver.findElement(dbtn));
        String res = getText(dtext);
        return res;
    }

    public String rclick(){

        scrollToElement(rbtn, driver);
        rightClick(driver, driver.findElement(rbtn));
        String res = getText(rtext);
        return res;
    }

    public String click(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(/*"arguments[0].scrollIntoView(true);", driver.findElement(noBtn)*/ "window,scrollBy(0,350)");
        doubleClick(driver, driver.findElement(cbtn));
        String res = getText(text);
        return res;
    }


}
