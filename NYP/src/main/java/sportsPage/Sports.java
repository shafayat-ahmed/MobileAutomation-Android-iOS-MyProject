package sportsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Sports extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")
    public static WebElement sports;
    public void setSports1() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Sonny Gray has no idea how it went horribly wrong with Yankees");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Sonny Gray has no idea how it went horribly wrong with Yankees";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSports2() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Mariano Rivera: Perfect choice for 1st perfect Hall of Fame ballot");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Mariano Rivera: Perfect choice for 1st perfect Hall of Fame ballot";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews1() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Sonny Gray has no idea how it went horribly wrong with Yankees");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Sonny Gray has no idea how it went horribly wrong with Yankees";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews2() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Mariano Rivera unanimously elected to Baseball Hall of Fame");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Mariano Rivera unanimously elected to Baseball Hall of Fame";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews3() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Rex Ryan possibility for Chiefs as they fire defensive coordinator");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Rex Ryan possibility for Chiefs as they fire defensive coordinator";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews4() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("The NFL is still trying to steal Tony Romo back");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "The NFL is still trying to steal Tony Romo back";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews5() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Bill Belichick has Jets jokes over Adam Gase era");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Bill Belichick has Jets jokes over Adam Gase era";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews6() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Mariano Rivera on Metallica: ‘I don’t listen to that kind of music’");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Mariano Rivera on Metallica: ‘I don’t listen to that kind of music’";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews7() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Watch: The moment Mariano Rivera found out he was Hall of Fame bound");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Watch: The moment Mariano Rivera found out he was Hall of Fame bound";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews8() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Ex-Yankee Mike Mussina joins Mariano Rivera in Hall of Fame class");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Ex-Yankee Mike Mussina joins Mariano Rivera in Hall of Fame class";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews9() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Derek Jeter congratulates Mariano Rivera on Hall of Fame election");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Derek Jeter congratulates Mariano Rivera on Hall of Fame election";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews10() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("Guilty assistant coach in NCAA corruption scandal cries in court");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Guilty assistant coach in NCAA corruption scandal cries in court";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void setSportsNews11() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(4);
        scrollAndClickByName("CBS sacks Super Bowl ad for medical marijuana");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "CBS sacks Super Bowl ad for medical marijuana";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
