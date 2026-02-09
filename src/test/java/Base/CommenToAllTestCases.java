package Base;

import DriverManager.DriverManager;
import Utilities.Log;
import org.testng.annotations.*;

public class CommenToAllTestCases {
    @BeforeMethod
    @Parameters({"browser"})
    public static void setUP(@Optional("chrome") String browser) {
        Log.info("Calling the browser");
        DriverManager.setUp(browser);
    }

    @AfterMethod
    public static void setDown() {
        Log.info("closing the browser");
        DriverManager.setDown();
    }
}