package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsTextBox extends CommenToAllPages {

    static WebDriver driver;
    public ElementsTextBox(WebDriver driver) {
        this.driver = driver;
    }

    //page Locaters
    private By fullName = By.xpath("//input[@placeholder=\"Full Name\"]");
    private By email = By.xpath("//input[@placeholder=\"name@example.com\"]");
    private By submit = By.id("submit");
    private By result = By.xpath("//p[@id=\"name\"]");

    //Page Actions

    public String textBoxCheck(){

        visibilityOfElement(fullName, "jitendra");
        visibilityOfElement(email, "abc@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        visibilityOfElement(submit);
        String resultText = getText(result);

        return resultText;
    }

}
