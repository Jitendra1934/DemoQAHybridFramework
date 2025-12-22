package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.BtnPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Btn extends CommenToAllTestCases {

    @Test
    public void doubleClick(){
        DriverManager.getDriver().get("https://demoqa.com/buttons");
        BtnPage bp = new BtnPage(DriverManager.getDriver());
        String result = bp.dclick();
        Assert.assertEquals(result, "You have done a double click");
    }

    @Test
    public void rightClick(){
        DriverManager.getDriver().get("https://demoqa.com/buttons");
        BtnPage bp = new BtnPage(DriverManager.getDriver());
        String result = bp.rclick();
        Assert.assertEquals(result, "You have done a right click");
    }

    @Test
    public void click(){
        DriverManager.getDriver().get("https://demoqa.com/buttons");
        BtnPage bp = new BtnPage(DriverManager.getDriver());
        String result = bp.click();
        Assert.assertEquals(result, "You have done a dynamic click");
    }
}
