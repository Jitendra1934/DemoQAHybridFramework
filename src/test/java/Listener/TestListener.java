package Listener;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import  Utilities.ScreenShotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object testClass = result.getInstance();
        CommenToAllTestCases baseTest = (CommenToAllTestCases) testClass;

        String testName = result.getMethod().getMethodName();
        ScreenShotUtils.takeScreenshot(DriverManager.getDriver(), testName);

        System.out.println("Screenshot captured for failed test: " + testName);
    }
}
