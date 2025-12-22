package Base;

import DriverManager.DriverManager;
import org.testng.annotations.*;

public class CommenToAllTestCases {
    @BeforeMethod
    @Parameters({"browser"})
    public static void setUP(@Optional("chrome") String browser) {
        DriverManager.setUp(browser);
    }

    @AfterMethod
    public static void setDown() {

        DriverManager.setDown();
    }
}