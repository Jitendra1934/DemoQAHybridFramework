package TestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase extends CommenToAllTestCases {
    @Test
    public void testCase() {
        DriverManager.getDriver().get("https://demoqa.com");
    }

    @Test
    public void testCase01() {
        DriverManager.getDriver().get("https://demoqa.com");
        Assert.assertEquals(DriverManager.getDriver().getTitle() , "DEMOQA");
    }
}
