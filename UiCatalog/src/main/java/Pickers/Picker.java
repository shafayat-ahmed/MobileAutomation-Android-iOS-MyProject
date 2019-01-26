package Pickers;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Picker extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]")
    public static WebElement pickers;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIPicker\"]")
    public static WebElement uipicker;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIDatePicker\"]")
    public static WebElement uidatepicker;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Custom\"]")
    public static WebElement custom;
    public void clickPicker() {
        pickers.click();
        uipicker.click();
        uidatepicker.click();
        custom.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Custom\"]")).getTagName();
        String expected = "XCUIElementTypeButton";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
