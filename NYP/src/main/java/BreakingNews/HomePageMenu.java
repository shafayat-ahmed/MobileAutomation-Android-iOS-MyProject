package BreakingNews;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class HomePageMenu extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(id = "br.com.golmobile.nypost:id/search_container")
    public static WebElement menuSearchBox;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement topNews;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
    public static WebElement menuNews;
    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    public static WebElement notifications;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
    public static WebElement emailNewsLetters;
    @FindBy(id = "contact_fields_email")
    public static WebElement emailInputBox;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    public static WebElement sports;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]")
    public static WebElement pageSix;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
    public static WebElement business;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]")
    public static WebElement opinion;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement entertainment;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    public static WebElement sportsTitle4;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement sportsLastestNews;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    public static WebElement living;
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
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[13]")
    public static WebElement photos;

    public void setMenuSearchBox(){
        menu.click();
        menuSearchBox.sendKeys("Arizona", Keys.ENTER);
    }
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
    public void setMenuNews(){
        clickByXpathWebElement(menu);
        clickByXpathWebElement(menuNews);
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
    public void setNotifications(){
        notifications.click();
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/notification_settings_header")).getText();
        String Expected = "Keep up on breaking news and much more. Choose which alerts you want to receive.";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSignUp(){
        menu.click();
        scrollAndClickByName("settings");
        emailNewsLetters.click();
        emailInputBox.sendKeys("bigm3152@aol.com");
    }
    public void setSports(){
        menu.click();
        sports.click();
        scrollAndClickByName("Sonny Gray has no idea how it went horribly wrong with Yankees");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Sonny Gray has no idea how it went horribly wrong with Yankees";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setPageSix(){
        menu.click();
        pageSix.click();
        scrollAndClickByName("Comedian Kevin Barnett dead at 32");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Comedian Kevin Barnett dead at 32";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/body_tile_text_view")).getText();
        String expected = "By Francesca Bacardi";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
    public void setBreakingNewsNotification(){
        notifications.click();
        breakingNewsNotification.click();
    }
    public void setNewYorkMetroNotifications(){
        notifications.click();
        newYorkMetroNotifications.click();
    }
    public void setSportsNotifications(){
        notifications.click();
        setSportsNotifications();
    }
    public void setEditorPickNotifications(){
        notifications.click();
        editorPickNotifications.click();
    }
    public void setPageSixNotifications(){
        notifications.click();
        pageSixNotifications.click();
    }
    public void setPhotos(){
        menu.click();
        photos.click();
    }
    public void setPhotos1(){
        menu.click();
        photos.click();
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    }
    public void setPhoto2(){
        menu.click();
        photos.click();
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    }
}