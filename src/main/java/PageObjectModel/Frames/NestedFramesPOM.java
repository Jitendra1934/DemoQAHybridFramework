package PageObjectModel.Frames;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPOM extends CommenToAllPages {

    WebDriver driver;

    public NestedFramesPOM(WebDriver driver){
        this.driver=driver;
    }

    private By nestedFrame = By.xpath("(//span[text()=\"Nested Frames\"])");

    private By parentFrame = By.xpath("(//body[text()=\"Parent frame\"])");


    public  String nestedFrameBtn(){
        wait(nestedFrame, driver);
        scrollToElement(nestedFrame, driver);
        click(nestedFrame, driver);
        return driver.getCurrentUrl();
    }
    public String switchToParentFrame(){
        driver.switchTo().frame("frame1");
        scrollToElement(parentFrame,driver);
        String text = getText(parentFrame, driver);
        driver.switchTo().defaultContent();
        return text;
    }
}
