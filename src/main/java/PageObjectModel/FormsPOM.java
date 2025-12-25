package PageObjectModel;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPOM extends CommenToAllPages {

    WebDriver driver;

    public FormsPOM(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locaters
    private By firstname = By.id("firstName");
    private By lastname = By.id("lastName");
    private By userEmail = By.xpath("//input[@id=\"userEmail\"]");
    private By genderMale = By.xpath("//label[@for=\"gender-radio-1\"]");
    private By genderFemale = By.xpath("//label[@for=\"gender-radio-2\"]");
    private By genderOther = By.xpath("//label[@for=\"gender-radio-3\"]");
    private By userNumber = By.xpath("//input[@id=\"userNumber\"]");
    private By studentName = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr/td[2]");
    private By studentEmail = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[2]/td[2]");
    private By gender = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[3]/td[2]");
    private By mobileNumber = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[4]/td[2]");

    private By submitBtn = By.xpath("//button[@id=\"submit\"]");
    private By afterSubmit = By.xpath("//div[text() =\"Thanks for submitting the form\"]");

    //page Actions

    public String submit() {
        sendKeys(firstname, "jitendra", driver);
        sendKeys(lastname, "punnam", driver);
        sendKeys(userEmail, "pj@gmail.com", driver);
        selected(genderMale, driver);
        selected(genderFemale, driver);
        selected(genderOther, driver);
        click(genderMale, driver);
        sendKeys(userNumber, "7894561230", driver);
        click(submitBtn, driver);
        String text =getText(afterSubmit, driver);
        return text;
    }

    public String getStudentName(){
        String name = getText(studentName, driver);
        return name;
    }
    public String getStudentEmail(){
        String email = getText(studentEmail, driver);
        return email;
    }
    public String getStudentGender(){
        String g = getText(gender, driver);
        return g;
    }
    public String getStudentNumber(){
        String number = getText(mobileNumber, driver);
        return number;
    }

}