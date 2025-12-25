package TestCases.Forms;

import Base.CommenToAllTestCasesBATest;
import DriverManager.DriverManager;
import PageObjectModel.FormsPOM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTestCases extends CommenToAllTestCasesBATest {

    @Test(priority = 1)
    public void submitTestCase(){
        DriverManager.getDriver().get("https://demoqa.com/automation-practice-form");
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String text = fp.submit();
        Assert.assertEquals(text, "Thanks for submitting the form");
    }
    @Test(priority = 2)
    public void getStudentName(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String name = fp.getStudentName();
        Assert.assertEquals(name, "jitendra punnam");
    }
    @Test(priority = 3)
    public void getStudentEmail(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String email = fp.getStudentEmail();
        Assert.assertEquals(email, "pj@gmail.com");
    }
  @Test(priority = 4)
    public void getStudentGender(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String g = fp.getStudentGender();
        Assert.assertEquals(g, "Male");
    }
   @Test(priority = 5)
    public void getStudentNumber(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String number = fp.getStudentNumber();
        Assert.assertEquals(number, "7894561230");
    }

}
