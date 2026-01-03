package TestCases.Frames;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.Frames.FramePOM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTestCases extends CommenToAllTestCases {

    @Test
    public void clickFrameBtn(){
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        FramePOM fp = new FramePOM(DriverManager.getDriver());
        String url = fp.clickFrameBtn();
        Assert.assertEquals(url, "https://demoqa.com/frames");
    }
    @Test
    public void switchToFrame1(){
        DriverManager.getDriver().get("https://demoqa.com/frames");
        FramePOM fp = new FramePOM(DriverManager.getDriver());
        String text = fp.switchToFrameOne();
        Assert.assertEquals(text, "This is a sample page");
    }
    @Test
    public void switchToFrame2(){
        DriverManager.getDriver().get("https://demoqa.com/frames");
        FramePOM fp = new FramePOM(DriverManager.getDriver());
        String text = fp.switchToFrameTwo();
        Assert.assertEquals(text, "This is a sample page");
    }
}
