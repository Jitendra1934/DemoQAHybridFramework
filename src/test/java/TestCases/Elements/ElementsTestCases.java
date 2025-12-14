package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.DemoQAPage;
import PageObjectModel.ElementsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTestCases extends CommenToAllTestCases {

    @Test(description = "Elements first test case")
    public void tc01(){

        DemoQAPage p = new DemoQAPage(DriverManager.getDriver());
        DriverManager.getDriver().get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,500)");

        p.clickElementsInDemoQA();
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://demoqa.com/elements");
    }


    @Test(description = "click on text element")
    public void tc02(){
        DemoQAPage p = new DemoQAPage(DriverManager.getDriver());
        DriverManager.getDriver().get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        p.clickElementsInDemoQA();
        ElementsPage ep = new ElementsPage(DriverManager.getDriver());
        ep.clickTextBox();
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://demoqa.com/text-box");

    }
}
