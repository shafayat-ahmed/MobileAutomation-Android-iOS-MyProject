package mediaPage;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Media extends Base {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[11]")
    public static WebElement media;
    public void setMedia() throws InterruptedException {
        menu.click();
        sleep(2);
        media.click();
        scrollAndClickByName("CBS sacks Super Bowl ad for medical marijuana");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "CBS sacks Super Bowl ad for medical marijuana";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}


