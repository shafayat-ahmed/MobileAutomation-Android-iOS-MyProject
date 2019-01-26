package businessPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Business extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
    public static WebElement business;
    public void setBusiness() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Starbucks partners with Uber Eats to expand coffee delivery");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Starbucks partners with Uber Eats to expand coffee delivery";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")).getText();
        String expected = "January 22, 2019 | 1:43am";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
    public void setBusinessNews1() throws InterruptedException {
        menu.click();
        business.click();
        scrollAndClickByName("World’s wealthiest people made $2.5B a day in 2018");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "World’s wealthiest people made $2.5B a day in 2018";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setBusinessNews2() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Steve Wynn’s defamation suit against Lisa Bloom moving forward");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Steve Wynn’s defamation suit against Lisa Bloom moving forward";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setBusinessNews3() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Dow sinks 300 points on fresh fears of a global slowdown");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Dow sinks 300 points on fresh fears of a global slowdown";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setBusinessNews4() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Arconic shares plunge 25 percent as company cancels auction");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Arconic shares plunge 25 percent as company cancels auction";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setBusinessNews5() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("EBay shares surge 12 percent after activist investor calls for breakup");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "EBay shares surge 12 percent after activist investor calls for breakup";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setBusinessNews6() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Alexandria Ocasio-Cortez could probe banks’ earnings");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Alexandria Ocasio-Cortez could probe banks’ earnings";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
