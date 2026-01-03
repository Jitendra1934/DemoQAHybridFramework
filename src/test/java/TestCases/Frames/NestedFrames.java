package TestCases.Frames;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;

import PageObjectModel.Frames.NestedFramesPOM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames extends CommenToAllTestCases {


    @Test
    public void switchToFrame(){

        DriverManager.getDriver().get("https://demoqa.com/alertsWindows");
        NestedFramesPOM np = new NestedFramesPOM(DriverManager.getDriver());
        String url = np.nestedFrameBtn();
        Assert.assertEquals(url, "https://demoqa.com/nestedframes");

    }

    @Test
    public void switchToParentFrame(){
        DriverManager.getDriver().get("https://demoqa.com/nestedframes");
        NestedFramesPOM np = new NestedFramesPOM(DriverManager.getDriver());
        String text = np.switchToParentFrame();
        Assert.assertEquals(text, "Parent frame");
    }
}