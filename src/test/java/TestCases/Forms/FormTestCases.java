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
    @Test(priority = 6)
    public void getDate(){

        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String date = fp.getDateOfBirth();
        Assert.assertEquals(date, "24 August,1999");
    }

    @Test(priority = 7)
    public void getSubject(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String sub  = fp.getSubjectname();
        Assert.assertEquals(sub, "Computer Science, Economics");
    }
    @Test(priority = 8)
    public void getHobbies(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String hobbies = fp.getHobbies();
        Assert.assertEquals(hobbies, "Sports, Reading, Music");
    }
    @Test(priority = 9)
    public void getUpload(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String upload = fp.getUpload();
        Assert.assertEquals(upload, "screenshot01");
    }
    @Test(priority = 10)
    public void getAddress(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String address = fp.getAddress();
        Assert.assertEquals(address, "Demo Address");
    }
    @Test(priority = 11)
    public void getStateAndCity(){
        FormsPOM fp = new FormsPOM(DriverManager.getDriver());
        String stateAndCity = fp.getDropDownSelectedStateAndCity();
        Assert.assertEquals(stateAndCity, "Haryana Karnal");
    }


}
