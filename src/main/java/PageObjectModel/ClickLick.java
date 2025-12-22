package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickLick extends CommenToAllPages {

    WebDriver driver;

    public ClickLick(WebDriver driver){
        this.driver=driver;
    }

    private By link = By.linkText("Home");

    public void clickLink(){
        scrollToElement(link, driver);
        click(link);

    }
}
