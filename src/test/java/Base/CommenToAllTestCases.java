package Base;

import DriverManager.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CommenToAllTestCases {
    @BeforeTest
    @Parameters({"browser"})
    public static void setUP(@Optional("chrome") String browser) {
        DriverManager.setUp(browser);
    }

    @AfterTest
    public static void setDown() {
        DriverManager.setDown();
    }
}