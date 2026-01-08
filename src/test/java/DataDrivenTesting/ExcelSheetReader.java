package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
public class ExcelSheetReader {
    public static Workbook workbook;
    public static Sheet sheet;
    public static String sheetPath = System.getProperty("user.dir")+"/src/test/Resources/Data Driven Testing File.xlsx";
    public Object[][] getDataFromExcelSheet(String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(sheetPath);

        workbook = WorkbookFactory.create(file);
        sheet = workbook.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i=0; i<sheet.getLastRowNum(); i++){

            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }

    @DataProvider
    public  Object[][] getData() throws IOException {

        return getDataFromExcelSheet("DemoQATestDataSheet");
    }


    @DataProvider
    public Object[][] getLoginPageValidData() throws IOException {
        ExcelSheetReader esr = new ExcelSheetReader();
        return esr.getDataFromExcelSheet("loginValidData");
    }

    @DataProvider
    public Object[][] getLoginPageInValidData() throws IOException {
        ExcelSheetReader esr = new ExcelSheetReader();
        return esr.getDataFromExcelSheet("loginInvalidData");
    }
}
