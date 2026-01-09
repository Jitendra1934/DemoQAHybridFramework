package TestCases.BookStore;

import Base.CommenToAllTestCasesBATest;
import DataDrivenTesting.ExcelSheetReader;
import DriverManager.DriverManager;
import PageObjectModel.BookStore.BookStoreProfilePOM;
import PageObjectModel.BookStore.BookstoreLoginPOM;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BookStoreProfileTestCases extends CommenToAllTestCasesBATest {


    @Test(dataProvider = "getLoginPageValidData", dataProviderClass = ExcelSheetReader.class)
    public void validLogin(String userName, String password) {
        DriverManager.getDriver().get("https://demoqa.com/login");
        BookstoreLoginPOM bsp = new BookstoreLoginPOM(DriverManager.getDriver());
        System.out.println(userName);
        System.out.println(password);
        String url = bsp.validLogin(userName, password);
        Assert.assertEquals(url, "https://demoqa.com/profile");
        String userNameText = bsp.getUserName();
        Assert.assertEquals(userNameText, "jitendra");
    }

    @Test(priority = 1)
    public void clickGoToStore(){
        BookStoreProfilePOM bspt = new BookStoreProfilePOM(DriverManager.getDriver());
        String url = bspt.clickGoToBookStore();
        Assert.assertEquals(url, "https://demoqa.com/books");
    }

    @Test(priority = 2)
    public void dropDown(){
        BookStoreProfilePOM bspp = new BookStoreProfilePOM(DriverManager.getDriver());
        List<String > actualElements = bspp.dropDownCheck();
        List<String> expectedElements = new ArrayList<>();
        expectedElements.add("5 rows");
        expectedElements.add("10 rows");
        expectedElements.add("20 rows");
        expectedElements.add("25 rows");
        expectedElements.add("50 rows");
        expectedElements.add("100 rows");
        for(int i =0; i<actualElements.size(); i++){
            if(actualElements.size() == expectedElements.size()){
                Assert.assertEquals(actualElements.get(i), expectedElements.get(i));
            }
            else
                Assert.assertEquals("one", "One");

        }
    }

    @Test(priority = 3)
    public void deleteAllBooks(){
        BookStoreProfilePOM bspp = new BookStoreProfilePOM(DriverManager.getDriver());
        String text = bspp.deleteAllBooks();
        Assert.assertEquals(text, "No books available in your's collection!");
    }
}
