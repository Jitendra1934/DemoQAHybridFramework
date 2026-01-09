package PageObjectModel.BookStore;

import Base.CommenToAllPages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BookStoreProfilePOM extends CommenToAllPages {

    WebDriver driver;

    public BookStoreProfilePOM(WebDriver driver){
        this.driver = driver;
    }

    private By goToBookStore = By.xpath("//button[@id=\"gotoStore\"]");
    private By dropDown = By.xpath("//select[@aria-label=\"rows per page\"]");
    private By deleteAllBooks  = By.xpath("//button[text()=\"Delete All Books\"]");
    private By okBtn = By.xpath("//button[@id=\"closeSmallModal-ok\"]");




    public String clickGoToBookStore(){
        wait(goToBookStore, driver);
        scrollToElement(goToBookStore, driver);
        click(goToBookStore, driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = driver.getCurrentUrl();
        driver.navigate().back();
        return url;

    }

    public List dropDownCheck(){
        driver.navigate().refresh();
        wait(dropDown, driver);
        scrollToElement(dropDown, driver);
        Select select = new Select(driver.findElement(dropDown));
         List<String> list = new ArrayList<>();
         for(WebElement option : select.getOptions()){
             list.add(option.getText());
         }
        select.selectByVisibleText("25 rows");
        System.out.println(driver.getCurrentUrl());
        return list;
    }

    public String deleteAllBooks(){
        driver.navigate().refresh();
        wait(deleteAllBooks, driver);
        scrollToElement(deleteAllBooks, driver);
        click(deleteAllBooks, driver);
        wait(okBtn, driver);
        scrollToElement(okBtn, driver);
        click(okBtn, driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        a.accept();
        return text;
    }
}
