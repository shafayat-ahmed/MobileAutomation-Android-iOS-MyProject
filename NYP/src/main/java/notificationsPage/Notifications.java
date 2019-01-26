package notificationsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Notifications extends Base {
    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    public static WebElement notifications;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Switch")
    public static WebElement breakingNewsNotification;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Switch")
    public static WebElement newYorkMetroNotifications;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Switch")
    public static WebElement sportsNotifications;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.Switch")
    public static WebElement editorPickNotifications;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.Switch")
    public static WebElement pageSixNotifications;
    public void setNotifications() {
        notifications.click();
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/notification_settings_header")).getText();
        String Expected = "Keep up on breaking news and much more. Choose which alerts you want to receive.";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
        public void setBreakingNewsNotification() throws InterruptedException {
            notifications.click();
            sleep(2);
            breakingNewsNotification.click();
        }
        public void setNewYorkMetroNotifications() throws InterruptedException {
            notifications.click();
            sleep(2);
            newYorkMetroNotifications.click();
        }
        public void setSportsNotifications()throws InterruptedException{
            notifications.click();
            sleep(2);
            sportsNotifications.click();
        }
        public void setEditorPickNotifications()throws InterruptedException{
            notifications.click();
            sleep(2);
            editorPickNotifications.click();
        }
        public void setPageSixNotifications() throws InterruptedException{
            notifications.click();
            sleep(2);
            pageSixNotifications.click();
        }
}
