package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks extends CommenToAllTestCases {

    @Test
    public void brokenLinks() throws IOException {

        DriverManager.getDriver().get("https://demoqa.com/broken");
        List<WebElement> links = DriverManager.getDriver().findElements(By.tagName("a"));
        for(WebElement link : links){
            String url = link.getAttribute("href");
            if(url!=null && !url.isEmpty()){
                System.out.println(url);
                brokenLink(url);
            }
        }
    }
    public void brokenLink(String url) throws IOException {
        URL u = new URL(url);
        HttpURLConnection connect = (HttpURLConnection) u.openConnection();
        connect.connect();
        int statusCode = connect.getResponseCode();
        if(statusCode >= 400 && statusCode <= 600){
            System.out.println(url+" is  broken with "+statusCode);
        }
        else{
            System.out.println(url+" is valid with "+statusCode);
        }
    }
}
