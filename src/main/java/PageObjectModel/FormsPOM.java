package PageObjectModel;

import Base.CommenToAllPages;
import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

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
    private By dateOfBirth = By.xpath("//input[@id=\"dateOfBirthInput\"]");
    private By selectYear = By.xpath("//select[@class=\"react-datepicker__year-select\"]");
    private By selectMonth = By.xpath("//select[@class=\"react-datepicker__month-select\"]");
    private By selectDate = By.xpath("//div[text()=\"24\"]");
    private By dOB = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[5]/td[2]");
    private By subjectSelect = By.xpath("//div[@id=\"subjectsWrapper\"]/div[2]/div/div/div");
    private By  subjectInput = By.xpath("//input[@id=\"subjectsInput\"]");
    private By subject =  By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[6]/td[2]");

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
        //handling the DOB
        click(dateOfBirth,driver);
        dropDownSelect(selectYear, driver, "1999");
        dropDownSelect(selectMonth, driver, "August");
        click(selectDate, driver);
        //handling subject
        click(subjectSelect, driver);
        sendKeys(subjectInput, "Computer Science", driver);
        clickEnter(subjectInput, driver);
        sendKeys(subjectInput, "Economics", driver);
        clickEnter(subjectInput, driver);

        //Submit btn
        click(submitBtn, driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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

    public String getDateOfBirth(){

        String date = getText(dOB,driver);
        return date;
    }

    public String getSubjectname(){
        String sub = getText(subject, driver);
        return sub;
    }
}