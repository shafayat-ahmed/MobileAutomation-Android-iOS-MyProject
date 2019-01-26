package Alerts;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Alerts extends Base {
    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    public static WebElement alert;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")
    public static WebElement simple;
    public void showSimple(){
        alert.click();
        simple.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    public static WebElement okCancel;
    public void showOkCancel(){
        alert.click();
        okCancel.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    public static WebElement customized;
    public void showCustom(){
        alert.click();
        customized.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
        Assert.assertEquals(Actual,Expected);
    }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    public static WebElement showSimpleAlerts;
    public void showSimpleAlerts(){
        alert.click();
        showSimpleAlerts.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"<Alert message>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        System.out.println(Actual);
        Assert.assertEquals(Actual,Expected);
    }
}
