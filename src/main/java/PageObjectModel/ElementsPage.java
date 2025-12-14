package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends CommenToAllPages {

    static WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locatores
    private By textBox = By.xpath("//span[text()=\"Text Box\"]");

    //Page Actions

    public void clickTextBox(){
        visibilityOfElement(textBox);
    }


}
