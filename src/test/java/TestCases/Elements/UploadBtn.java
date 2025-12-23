package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.UploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadBtn extends CommenToAllTestCases {

    @Test
    public void uploadTestCase(){

        DriverManager.getDriver().get("https://demoqa.com/upload-download");
        UploadPage up = new UploadPage(DriverManager.getDriver());
        String path =up.upload();
        System.out.println(path);
        Assert.assertEquals(path, "C:\\fakepath\\screenshot01");
    }

    @Test
    public void download(){

        DriverManager.getDriver().get("https://demoqa.com/upload-download");
        UploadPage up = new UploadPage(DriverManager.getDriver());
        String text =up.download();
        System.out.println(text);
        Assert.assertEquals(text, "btn is enabled and clicked");
    }

}
