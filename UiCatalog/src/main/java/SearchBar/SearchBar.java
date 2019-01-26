package SearchBar;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchBar extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SearchBar\"]")
    public static WebElement searchbar;
    public void clickOnSearchBar() {
        searchbar.click();
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"SearchBar\"]")).getText();
        String expected = "SearchBar";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
}
