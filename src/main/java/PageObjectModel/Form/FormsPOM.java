package PageObjectModel.Form;

import Base.CommenToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FormsPOM extends CommenToAllPages {

    WebDriver driver;

    public FormsPOM(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locaters
    private final By firstname = By.id("firstName");
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
    private By subjectInput = By.xpath("//input[@id=\"subjectsInput\"]");
    private By subject =  By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[6]/td[2]");
    private By hobbiesSportsCheckBox = By.xpath("//label[text()=\"Sports\"]");
    private By hobbiesReadingCheckBox = By.xpath("//label[text()=\"Reading\"]");
    private By hobbiesMusicCheckBox = By.xpath("//label[text()=\"Music\"]");
    private By hobbies = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[7]/td[2]");
    private By uploadBtn = By.xpath("//input[@id=\"uploadPicture\"]");
    private By uploadText = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[8]/td[2]");
    private By address = By.xpath("//textarea[@placeholder=\"Current Address\"]");
    private By addressText = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[9]/td[2]");
    private By sateDropDown = By.xpath("//div[text()=\"Select State\"]");
    private By selectSate = By.xpath("//div[text()=\"Haryana\"]");
    private By stateAndCityText = By.xpath("//table[@class=\"table table-dark table-striped table-bordered table-hover\"]/tbody/tr[10]/td[2]");
    private By cityDropDown = By.xpath("//div[text()=\"Select City\"]");
    private By selectCity = By.xpath("//div[text()=\"Karnal\"]");
    private By submitBtn = By.xpath("//button[@id=\"submit\"]");
    private By afterSubmit = By.xpath("//div[text() =\"Thanks for submitting the form\"]");


    //page Actions

    public String submit() {
        wait(firstname, driver);
        scrollToElement(firstname, driver);
        sendKeys(firstname, "jitendra", driver);
        wait(lastname, driver);
        scrollToElement(lastname, driver);
        sendKeys(lastname, "punnam", driver);
        wait(userEmail, driver);
        scrollToElement(userEmail, driver);
        sendKeys(userEmail, "pj@gmail.com", driver);

        selected(genderMale, driver);
        selected(genderFemale, driver);
        selected(genderOther, driver);
        selected(genderMale, driver);
        wait(userNumber, driver);
        scrollToElement(userNumber, driver);
        sendKeys(userNumber, "7894561230", driver);
        //handling the DOB
        wait(dateOfBirth, driver);
        scrollToElement(dateOfBirth, driver);
        click(dateOfBirth,driver);
        calenderDropDownSelect(selectYear, driver, "1999");
        calenderDropDownSelect(selectMonth, driver, "August");
        wait(selectDate, driver);
        scrollToElement(selectDate, driver);
        click(selectDate, driver);
        //handling subject
        wait(subjectSelect, driver);
        scrollToElement(subjectSelect, driver);
        click(subjectSelect, driver);
        wait(subjectInput, driver);
        scrollToElement(subjectInput, driver);
        sendKeys(subjectInput, "Computer Science", driver);
        clickEnter(subjectInput, driver);
        sendKeys(subjectInput, "Economics", driver);
        clickEnter(subjectInput, driver);
        //Hobbies Selected
        selected(hobbiesSportsCheckBox, driver);
        selected(hobbiesReadingCheckBox, driver);
        selected(hobbiesMusicCheckBox, driver);
        //upload btn
        wait(uploadBtn, driver);
        scrollToElement(uploadBtn, driver);
        sendKeys(uploadBtn, "C:\\Users\\hp\\IdeaProjects\\DemoQAHybridFramework\\screenshot01", driver);
        //Address
        wait(address, driver);
        scrollToElement(address, driver);
        sendKeys(address, "Demo Address", driver);
        //StateAndCity
        dropDownHandler(sateDropDown, selectSate, cityDropDown,selectCity,driver);

        //Submit btn
        wait(submitBtn, driver);
        scrollToElement(submitBtn, driver);
        click(submitBtn, driver);
        wait(afterSubmit, driver);
        scrollToElement(afterSubmit, driver);
        String text =getText(afterSubmit, driver);
        return text;
    }

    public String getStudentName(){
        wait(studentName, driver);
        scrollToElement(studentName, driver);
        String name = getText(studentName, driver);
        return name;
    }
    public String getStudentEmail(){
        wait(studentEmail, driver);
        scrollToElement(studentEmail, driver);
        String email = getText(studentEmail, driver);
        return email;
    }
    public String getStudentGender(){
        wait(gender, driver);
        scrollToElement(gender, driver);
        String g = getText(gender, driver);
        return g;
    }
    public String getStudentNumber(){
        wait(mobileNumber, driver);
        scrollToElement(mobileNumber, driver);
        String number = getText(mobileNumber, driver);
        return number;
    }

    public String getDateOfBirth(){

        wait(dOB, driver);
        scrollToElement(dOB, driver);
        String date = getText(dOB,driver);
        return date;
    }

    public String getSubjectname(){
        wait(subject, driver);
        scrollToElement(subject, driver);
        String sub = getText(subject, driver);
        return sub;
    }

    public String  getHobbies(){
        wait(hobbies, driver);
        scrollToElement(hobbies, driver);
        String hobbiesSelected = getText(hobbies, driver);
        return hobbiesSelected;
    }

    public String getUpload(){
        wait(uploadText, driver);
        scrollToElement(uploadText, driver);
        String upload = getText(uploadText, driver);
        return upload;
    }

    public String getAddress(){
        wait(addressText, driver);
        scrollToElement(addressText, driver);
        String add = getText(addressText, driver);
        return add;
    }

    public String getDropDownSelectedStateAndCity(){
        wait(stateAndCityText, driver);
        scrollToElement(stateAndCityText, driver);
        String stateAndCity = getText(stateAndCityText, driver);
        return stateAndCity;
    }
}