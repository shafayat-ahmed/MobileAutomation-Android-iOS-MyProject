package entertainmentPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Entertainment extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]")
    public static WebElement entertainment;
    public void setEntertainment1() throws InterruptedException {
        menu.click();
        sleep(2);
        entertainment.click();
        scrollAndClickByName("How Stephen Malkmus got his ‘Groove’ back");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "How Stephen Malkmus got his ‘Groove’ back";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")).getText();
        String expected = "January 22, 2019 | 3:36pm";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
    public void setEntertainment2() throws InterruptedException {
        menu.click();
        sleep(2);
        entertainment.click();
        scrollAndClickByName("James Gandolfini’s son to play young Tony Soprano in prequel movie");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "James Gandolfini’s son to play young Tony Soprano in prequel movie";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
