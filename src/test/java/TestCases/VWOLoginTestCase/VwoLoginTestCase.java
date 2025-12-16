package TestCases.VWOLoginTestCase;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.VwoPage;
import Utilities.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class VwoLoginTestCase extends CommenToAllTestCases {

    @Test
    public void loginTestCase() throws IOException {
        VwoPage v = new VwoPage(DriverManager.getDriver());
        DriverManager.getDriver().get(PropertyReader.readKey("link"));
        String error = v.loginTestCase();
        Assert.assertEquals(error, PropertyReader.readKey("etext"));
    }

    @Test
    public void loginTextFail() throws IOException {
        VwoPage v = new VwoPage(DriverManager.getDriver());
        DriverManager.getDriver().get(PropertyReader.readKey("link"));
        String error = v.loginFailTestCase();
        Assert.assertEquals(error, "The Test Case is Fail");
    }
}
