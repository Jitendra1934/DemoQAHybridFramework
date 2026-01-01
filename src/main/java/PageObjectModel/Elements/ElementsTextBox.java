package PageObjectModel.Elements;

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
        wait(fullName, driver);
        scrollToElement(fullName, driver);
        sendKeys(fullName, "jitendra", driver);
        wait(email, driver);
        scrollToElement(email, driver);
        sendKeys(email, "abc@gmail.com", driver);
        wait(submit, driver);
        scrollToElement(submit, driver);
        click(submit, driver);
        wait(result, driver);
        scrollToElement(result, driver);
        String resultText = getText(result, driver);
        return resultText;
    }
}
