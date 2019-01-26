package metroPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Metro extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]")
    public static WebElement metro;
    public void setMetro() throws InterruptedException {
        menu.click();
        sleep(2);
        metro.click();
        scrollAndClickByName("Andrew Cuomo signs bill updating New York’s abortion law");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Andrew Cuomo signs bill updating New York’s abortion law";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
