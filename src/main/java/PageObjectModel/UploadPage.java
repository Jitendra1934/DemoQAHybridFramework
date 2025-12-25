package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage extends CommenToAllPages {

    WebDriver driver ;

    public UploadPage(WebDriver driver){
        this.driver=driver;
    }

    //page locators
    private By uploadBtn = By.xpath("//input[@id=\"uploadFile\"]");
    private By filePath = By.xpath("//p[@id=\"uploadedFilePath\"]");
    private By downloadBtn = By.xpath("//a[@id=\"downloadButton\"]");

    //page actions
    public String upload(){
        sendKeys(uploadBtn, "C:\\Users\\hp\\IdeaProjects\\DemoQAHybridFramework\\screenshot01", driver);
        String path = getText(filePath, driver);
        return path;
    }

    public String download() {
      String text = enabled(downloadBtn,driver);
      return text;
    }
}
