package Transitions;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transitions extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]")
    public static WebElement transitions;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Flip Image\"]")
    public static WebElement flipImage;
    public void clickOnFlipImage() {
        transitions.click();
        flipImage.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Flip Image\"]")).getText();
        String expected = "Flip Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
