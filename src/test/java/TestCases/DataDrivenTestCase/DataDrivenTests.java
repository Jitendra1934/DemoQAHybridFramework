package TestCases.DataDrivenTestCase;

import DataDrivenTesting.ExcelSheetReader;
import org.testng.annotations.Test;

public class DataDrivenTests {

    @Test(dataProvider = "getData", dataProviderClass = ExcelSheetReader.class)
    public void tc01(String num, String number){
        System.out.println(num+ " "+number);
    }
}
