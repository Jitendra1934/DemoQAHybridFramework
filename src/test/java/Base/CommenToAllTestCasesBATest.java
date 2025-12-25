package Base;

import DriverManager.DriverManager;
import org.testng.annotations.*;

public class CommenToAllTestCasesBATest {

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
