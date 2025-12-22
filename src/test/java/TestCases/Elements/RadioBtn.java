package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.RadioBtnPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioBtn extends CommenToAllTestCases {

//    @Test
//    public void yes(){
//        DriverManager.getDriver().get("https://demoqa.com/radio-button");
//        RadioBtnPage bp = new RadioBtnPage(DriverManager.getDriver());
//        String rText = bp.clickYesBtn();
//        Assert.assertEquals(rText, "Yes");
//    }
//    @Test
//    public void imp(){
//        DriverManager.getDriver().get("https://demoqa.com/radio-button");
//
//        RadioBtnPage bp = new RadioBtnPage(DriverManager.getDriver());
//        String rText = bp.clickImpBtn();
//        Assert.assertEquals(rText, "Impressive");
//    }
    @Test
    public void no(){
        DriverManager.getDriver().get("https://demoqa.com/radio-button");
        RadioBtnPage bp = new RadioBtnPage(DriverManager.getDriver());
        String rText = bp.clickNoBtn();
        Assert.assertEquals(rText, "No");
    }
}
