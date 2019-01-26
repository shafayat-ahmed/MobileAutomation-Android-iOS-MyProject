package TextView;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextView extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
    public static WebElement textView;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\\\"UICatalog\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView")
    public static WebElement readText;

    public void clickOnTextView() {
        textView.click();
        String actual = readText.getText();
        String expected = "Now is the time for all good developers to come to serve their country.";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
