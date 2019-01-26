package fashionPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Fashion extends Base {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]")
    public static WebElement fashion;
    public void setFashion1() throws InterruptedException {
        menu.click();
        sleep(2);
        fashion.click();
        scrollAndClickByName("Online retailer pulls anti-Semitic shirt following backlash");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Online retailer pulls anti-Semitic shirt following backlash";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setFashion2() throws InterruptedException {
        menu.click();
        sleep(2);
        fashion.click();
        scrollAndClickByName("Who wore it better: Kourtney Kardashian or her couch?");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Who wore it better: Kourtney Kardashian or her couch?";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
