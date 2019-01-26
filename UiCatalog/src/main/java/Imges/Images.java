package Imges;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Images extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
    public static WebElement image;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")
    public static WebElement durationbutton;
    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"Images\"]")
    public static WebElement imageOfMountain;
    public void clickOnDuration(){
        image.click();
        durationbutton.click();
        String actual = durationbutton.getText();
        System.out.println(actual);
        String expected = "75%";
        Assert.assertEquals(actual, expected);
    }
    public void clickOnImage() {
        image.click();
        imageOfMountain.getText();
        String actual = imageOfMountain.getText();
        System.out.println(actual);
        String expected = "Image";
        Assert.assertEquals(actual, expected);
    }
}
