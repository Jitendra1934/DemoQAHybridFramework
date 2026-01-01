package TestCases.AlertsTestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.Alerts.BrowserAlerts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserWindowAlerts extends CommenToAllTestCases {

    @Test
    public void openBrowserWindows(){
        DriverManager.getDriver().get("https://demoqa.com/alertsWindows");
        BrowserAlerts ba = new BrowserAlerts(DriverManager.getDriver());
        String url = ba.clickBrowserWindowsBtn();
        Assert.assertEquals(url, "https://demoqa.com/browser-windows");
    }

    @Test
    public void newTabBtn(){
        DriverManager.getDriver().get("https://demoqa.com/browser-windows");
        BrowserAlerts ba = new BrowserAlerts(DriverManager.getDriver());
        String url = ba.clickNewTab();
        Assert.assertEquals(url, "https://demoqa.com/sample");
    }

    @Test
    public void newWindowBtn(){
        DriverManager.getDriver().get("https://demoqa.com/browser-windows");
        BrowserAlerts ba = new BrowserAlerts(DriverManager.getDriver());
        String url = ba.clickNewWindow();
        Assert.assertEquals(url, "https://demoqa.com/sample");
    }
    @Test
    public void newWindowMsgBtn(){
        DriverManager.getDriver().get("https://demoqa.com/browser-windows");
        BrowserAlerts ba = new BrowserAlerts(DriverManager.getDriver());
        String text = ba.clickNewMsgWindow();
        Assert.assertEquals(text, "Window is Opened");
    }
}
