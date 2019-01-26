package Toolbar;


import common.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Toolbar extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]")
    public static WebElement toolbar;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Image\"]")
    public static WebElement imageButton;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Tinted\"]")
    public static WebElement tinted;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Default\"]")
    public static WebElement styleDefault;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Black\"]")
    public static WebElement styleBlack;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Translucent\"]")
    public static WebElement styleTranslucent;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]"
    )public static WebElement done;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Image\"]")
    public static WebElement image;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item1\"]")
    public static WebElement item1;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item2\"]")
    public static WebElement item2;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Tools\"]")
    public static WebElement tools;
    public void clickOnImageButton() {
        toolbar.click();
        imageButton.click();
        String actual = image.getText();
        String expected = "Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setTinted(){
        clickByXpathWebElement(tinted);
        String actual = tinted.getText();
        String expected = "Tinted";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setStyleDefault(){
        clickByXpathWebElement(styleDefault);
        String actual = styleDefault.getText();
        String expected = "Style";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setStyleBlack(){
        clickByXpathWebElement(styleBlack);
        String actual = styleBlack.getText();
        String expected = "Style Black";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setStyleTranslucent(){
        clickByXpathWebElement(styleTranslucent);
        String actual = styleTranslucent.getText();
        String expected = "Style Translucent";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setDone(){
        clickByXpathWebElement(done);
        String actual = done.getText();
        String expected = "Done";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setImage(){
        clickByXpathWebElement(image);
        String actual = image.getText();
        String expected = "Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setItem1(){
        clickByXpathWebElement(item1);
        String actual = item1.getText();
        String expected = "IPhone";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setItme2(){
        clickByXpathWebElement(item2);
        String actual = item2.getText();
        String expected = "IPad";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void setTools(){
        clickByXpathWebElement(tools);
        String actual = tools.getText();
        String expected = "Tools";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
