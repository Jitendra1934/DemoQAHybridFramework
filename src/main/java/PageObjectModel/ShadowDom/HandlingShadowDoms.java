package PageObjectModel.ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingShadowDoms {


    WebDriver driver;
    public HandlingShadowDoms(WebDriver driver) {
        this.driver = driver;
    }

    public String shadowDom(){

        SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

        WebElement shadowElement = shadow.findElement(By.cssSelector("#shadow-element"));

        if(shadowElement.isDisplayed()){

            return "Element is located and displayed";
        }
        return "Element is not located";
    }

    public String nestedShadowDom(){

        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();

        WebElement shadowElement = shadow1.findElement(By.cssSelector("#nested-shadow-element"));

        if(shadowElement.isDisplayed()){

            return "Nested shadow Element is located and displayed";
        }
        return "Element is not located";
    }

    public String multiNestedDom(){

        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();

        SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();

        WebElement shadowElement = shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));

        if(shadowElement.isDisplayed()){

            return "Multi Nested shadow Element is located and displayed";
        }
        return "Element is not located";
    }


}
