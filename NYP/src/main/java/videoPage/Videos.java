package videoPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class Videos extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[14]")
    public static WebElement videos;

    public void setVideos() throws InterruptedException {
        menu.click();
        sleep(2);
        videos.click();
        scrollAndClickByName("Naked men discuss their body hair choices");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Naked men discuss their body hair choices";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[11]/android.widget.LinearLayout/android.widget.TextView")
    public static WebElement Video;
    public void setVideoNews1() throws InterruptedException {
        menu.click();
        scrollAndClickByName("Video");
        scrollAndClickByName("Activist puts four venomous snakes in his mouth to save the rainforest");
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_play_icon_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_player_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/play")).click();
        sleep(5);
        ad.navigate().back();
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Activist puts four venomous snakes in his mouth to save the rainforest";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setVideoNews2() throws InterruptedException {
        menu.click();
        scrollAndClickByName("Video");
        scrollAndClickByName("Pissed-off worker plows digger through Travelodge hotel lobby");
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_play_icon_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_player_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/play")).click();
        wait(10);
        ad.navigate().back();
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Pissed-off worker plows digger through Travelodge hotel lobby";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setVideoNews3() throws InterruptedException {
        menu.click();
        scrollAndClickByName("Video");
        scrollAndClickByName("Bull rips man’s pants off during public festival");
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_play_icon_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_player_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/play")).click();
        wait(10);
        ad.navigate().back();
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Bull rips man’s pants off during public festival";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setVideoNews4() throws InterruptedException {
        menu.click();
        scrollAndClickByName("Video");
        scrollAndClickByName("Bottled water freezes instantly in cool science trick");
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_play_icon_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/brightcove_player_view")).click();
        ad.findElement(By.id("br.com.golmobile.nypost:id/play")).click();
        sleep(10);
        ad.navigate().back();
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "Bottled water freezes instantly in cool science trick";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}