package PageObjectModel.Frames;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePOM extends CommenToAllPages {

    WebDriver driver;
    public FramePOM(WebDriver driver){
        this.driver=driver;
    }

      private By frameBtn = By.xpath("//span[text()=\"Frames\"]");
     /* private By frameOne = By.xpath("//iframe[@id=\"frame1\"]");
      private By frameTwo = By.xpath("//iframe[@id=\"frame2\"]");*/
      private By frame1text = By.id("sampleHeading");
      private By frame2text = By.id("sampleHeading");


    public String clickFrameBtn(){
        wait(frameBtn, driver);
        scrollToElement(frameBtn, driver);
        click(frameBtn, driver);
        return driver.getCurrentUrl();
    }

    public String switchToFrameOne(){
        //frameWait(frameOne, driver);
        driver.switchTo().frame("frame1");
        scrollToElement(frame1text, driver);
        String text = getText(frame1text, driver);
        driver.switchTo().defaultContent();
        return text;
    }

    public String switchToFrameTwo(){
       // frameWait(frameTwo, driver);
        driver.switchTo().frame("frame2");
        scrollToElement(frame2text, driver);
        String text = getText(frame2text, driver);
        driver.switchTo().defaultContent();
        return text;
    }

}
