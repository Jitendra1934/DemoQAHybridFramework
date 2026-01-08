package TestCases.BookStore;

import Base.CommenToAllTestCases;
import DataDrivenTesting.ExcelSheetReader;
import DriverManager.DriverManager;
import PageObjectModel.BookStore.BookstoreLoginPOM;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTestCases extends CommenToAllTestCases {

    @Test
    public void clickBookStoreApplication(){
        DriverManager.getDriver().get("https://demoqa.com/");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        String url=bsp.clickBookStoreApplication();
        Assert.assertEquals(url, "https://demoqa.com/books");
    }

    @Test
    public void clickLoginBtn(){
        DriverManager.getDriver().get("https://demoqa.com/books/");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        String url = bsp.loginClick();
        Assert.assertEquals(url, "https://demoqa.com/books/login");
    }

    @Test
    public void clickNewUser(){
        DriverManager.getDriver().get("https://demoqa.com/login");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        String url = bsp.clickNewUser();
        Assert.assertEquals(url, "https://demoqa.com/register");
        
    }

    @Test(dataProvider = "getLoginPageValidData", dataProviderClass = ExcelSheetReader.class)
    public void validLogin(String userName, String password){
        DriverManager.getDriver().get("https://demoqa.com/login");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        System.out.println(userName);
        System.out.println(password);
        String url = bsp.validLogin(userName, password);
        Assert.assertEquals(url, "https://demoqa.com/profile");
        String userNameText = bsp.getUserName();
        Assert.assertEquals(userNameText, "jitendra");
    }

    @Test(dataProvider = "getLoginPageInValidData", dataProviderClass = ExcelSheetReader.class)
    public void inValidLogin(String userName, String password) {
        DriverManager.getDriver().get("https://demoqa.com/login");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        System.out.println(userName);
        System.out.println(password);
        String text = bsp.inValidLogin(userName, password);
        Assert.assertEquals(text, "Invalid username or password!");

    }


}
