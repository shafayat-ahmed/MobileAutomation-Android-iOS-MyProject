package settingsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Settings extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
    public static WebElement emailNewsLetters;
    @FindBy(id = "contact_fields_email")
    public static WebElement emailInputBox;
    public void setSignUp() throws InterruptedException {
        menu.click();
        sleep(2);
        scrollAndClickByName("settings");
        sleep(2);
        emailNewsLetters.click();
        sleep(3);
        emailInputBox.sendKeys("bigm3152@aol.com");
    }
    public void privacyPolicy() throws InterruptedException {
        menu.click();
        sleep(2);
        scrollAndClickByName("Settings");
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.RelativeLayout/android.widget.TextView");
        String Actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View")).getText();
        String Expected = "Privacy";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]")).getText();
        String expected = "Effective Date: November 14, 2018";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
    public void termsAndConditions()throws InterruptedException{
        menu.click();
        sleep(2);
        scrollAndClickByName("Settings");
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView");
        String Actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View")).getText();
        String Expected = "TERMS OF USE";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]")).getText();
        String expected = "Last Updated: March 23, 2017";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}
