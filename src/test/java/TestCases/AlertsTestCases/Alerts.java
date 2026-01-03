package TestCases.AlertsTestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.Alerts.AlertsConcept;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts extends CommenToAllTestCases {

    @Test
    public void alertClick() {
        DriverManager.getDriver().get("https://demoqa.com/");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String url = ac.clickAlert();
        Assert.assertEquals(url, "https://demoqa.com/alertsWindows");
    }

    @Test
    public void alertMenuClick() {
        DriverManager.getDriver().get("https://demoqa.com/alertsWindows");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String url = ac.alertMenuBtn();
        Assert.assertEquals(url, "https://demoqa.com/alerts");

    }

    @Test
    public void alert() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.alert();
        Assert.assertEquals(text, "You clicked a button");
    }

    @Test
    public void timeAlert() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.timeAlertClick();
        Assert.assertEquals(text, "This alert appeared after 5 seconds");
    }

    @Test
    public void yesAlert() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.yesAlert();
        Assert.assertEquals(text, "You selected Ok");
    }

    @Test
    public void cancelAlert() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.cancelAlert();
        Assert.assertEquals(text, "You selected Cancel");
    }
    @Test
    public void yesPromt() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.yesPromt();
        Assert.assertEquals(text, "You entered jitendra");
    }

    @Test
    public void cancelPromt() {
        DriverManager.getDriver().get("https://demoqa.com/alerts");
        AlertsConcept ac = new AlertsConcept(DriverManager.getDriver());
        String text = ac.cancelPromt();
        Assert.assertEquals(text, "alert cancel");
    }
}
