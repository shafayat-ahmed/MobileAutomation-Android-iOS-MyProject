package Segments;
import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Segments extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]")
    public static WebElement segments;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]" )
    public static WebElement check;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    public static WebElement search;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    public static WebElement tools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]")
    public static WebElement tools1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    public static WebElement check1;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]")
    public static WebElement searchred;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]")
    public static WebElement toolsred;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]")
    public static WebElement checkimage;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[5]")
    public static WebElement toolsimage;

    public void clickOnSegments() {
        segments.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"Segments\"]")).getText();
        String expected = "Segments";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlCheck() {
        segments.click();
        check.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Check\"])[1]")).getText();
        String expected = "Check";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlSearch() {
        segments.click();
        search.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Search\"])[1]")).getText();
        String expected = "Search";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlTools() {
        segments.click();
        tools.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Tools\"])[1]")).getText();
        String expected = "Tools";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBorderedtools() {
        segments.click();
        tools1.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Tools\"])[2]")).getText();
        String expected = "Tools1";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBorderedCheck() {
        segments.click();
        check1.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Check\"])[3]")).getText();
        String expected = "Check1";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBarSearchRed() {
        segments.click();
        searchred.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Search\"])[4]")).getText();
        String expected = "Red Search";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBarSearchRedTools() {
        segments.click();
        toolsred.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Tools\"])[4]")).getText();
        String expected = "Red Tools";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBarImage() {
        segments.click();
        checkimage.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Check\"])[5]")).getText();
        String expected = "Check Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void SegmentsControlStyleBarImage1() {
        segments.click();
        toolsimage.click();
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Tools\"])[5]")).getText();
        String expected = "Tools Image";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
