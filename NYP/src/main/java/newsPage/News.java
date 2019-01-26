package newsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class News extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
    public static WebElement news;
    public void setNews() throws InterruptedException {
        clickByXpathWebElement(menu);
        sleep(2);
        clickByXpathWebElement(news);
        sleep(2);
        scrollAndClickByName("Twitter suspends account behind video of Native American’s standoff with teens");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Twitter suspends account behind video of Native American’s standoff with teens";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")).getText();
        String expected = "By Yaron Steinbuch";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}
