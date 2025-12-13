package TestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import org.testng.annotations.Test;

public class FirstTestCase extends CommenToAllTestCases {
    @Test
    public void testCase() {
        DriverManager.getDriver().get("https://demoqa.com");
    }
}
