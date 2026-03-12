package TestCases.ShadowDomTestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.ShadowDom.HandlingShadowDoms;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShadowDom extends CommenToAllTestCases {


    @Test
    public void shadowDom(){
        HandlingShadowDoms doms = new HandlingShadowDoms(DriverManager.getDriver());
        DriverManager.getDriver().get("https://dev.automationtesting.in/shadow-dom");
        String result = doms.shadowDom();
        Assert.assertEquals(result, "Element is located and displayed");
    }

    @Test
    public void nestedDom(){
        HandlingShadowDoms doms = new HandlingShadowDoms(DriverManager.getDriver());
        DriverManager.getDriver().get("https://dev.automationtesting.in/shadow-dom");
        String result = doms.nestedShadowDom();
        Assert.assertEquals(result, "Nested shadow Element is located and displayed");
    }

    @Test
    public void multiNestedDom(){

        HandlingShadowDoms doms = new HandlingShadowDoms(DriverManager.getDriver());
        DriverManager.getDriver().get("https://dev.automationtesting.in/shadow-dom");
        String result = doms.multiNestedDom();
        Assert.assertEquals(result, "Multi Nested shadow Element is located and displayed");

    }
}
