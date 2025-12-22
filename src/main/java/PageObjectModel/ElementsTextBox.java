package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsTextBox extends CommenToAllPages {

    WebDriver driver;
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

        clickAndReturn(fullName, "jitendra");
        clickAndReturn(email, "abc@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(submit));
        click(submit);
        String resultText = getText(result);
        return resultText;
    }
}
