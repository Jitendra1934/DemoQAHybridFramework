package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.ClickLick;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickLinkElement extends CommenToAllTestCases {

    @Test
    public void clicklink(){
        DriverManager.getDriver().get("https://demoqa.com/links");
        ClickLick cl = new ClickLick(DriverManager.getDriver());
        cl.clickLink();
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "DEMOQA");

    }
}
