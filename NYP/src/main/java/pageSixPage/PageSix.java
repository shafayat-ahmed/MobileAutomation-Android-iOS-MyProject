package pageSixPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class PageSix extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]")
    public static WebElement pageSix;
    public void setPageSix() throws InterruptedException {
        menu.click();
        sleep(2);
        pageSix.click();
        sleep(2);
        scrollAndClickByName("Chris Brown released from custody after rape accusation");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Chris Brown released from custody after rape accusation";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/body_tile_text_view")).getText();
        String expected = "By Chris Perez";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}
