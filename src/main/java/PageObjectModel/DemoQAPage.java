package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAPage extends CommenToAllPages {

    WebDriver driver;

    public DemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page locatores
    private By elements = By.xpath("//h5[text()=\"Elements\"]");

    //PageActions
    public void clickElementsInDemoQA(){
       click(elements);
    }
}
