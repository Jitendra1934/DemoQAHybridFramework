package TestCases.Elements;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.ElementsTextBox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBox extends CommenToAllTestCases {

    @Test
   public void textBox(){
       DriverManager.getDriver().get("https://demoqa.com/text-box");
       ElementsTextBox tb = new ElementsTextBox(DriverManager.getDriver());
       String res = tb.textBoxCheck();
       Assert.assertEquals(res, "Name:jitendra");
   }
}
