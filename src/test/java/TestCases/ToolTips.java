package TestCases;

import Base.CommenToAllTestCases;
import DriverManager.DriverManager;
import PageObjectModel.Tooltips.FacebookToolTips;
import io.reactivex.rxjava3.internal.observers.ForEachWhileObserver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTips extends CommenToAllTestCases {

    @Test
    public void toolTip(){
        DriverManager.getDriver().get("https://www.facebook.com/");
        FacebookToolTips ft = new FacebookToolTips(DriverManager.getDriver());
        String toolTip = ft.getToolTip();
        Assert.assertEquals(toolTip, "Sign up for Facebook");
    }
}
