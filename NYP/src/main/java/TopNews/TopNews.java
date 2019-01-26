package TopNews;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopNews extends Base {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement topNews;
    public void setTopNews(){
        clickByXpathWebElement(topNews);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Young men busted for planning attack on New York Muslim community";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")).getText();
        String expected = "January 22, 2019 | 2:49pm";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}
