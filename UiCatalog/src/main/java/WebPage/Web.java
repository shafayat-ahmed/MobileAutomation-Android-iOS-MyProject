package WebPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]")
    public static WebElement web;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]")
    public static WebElement buyNow;
    public void clickOnWeb() {
        web.click();
        buyNow.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]")).getText();
        String expected = "Web";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
