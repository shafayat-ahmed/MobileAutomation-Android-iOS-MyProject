package searchPage;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
    public static WebElement menuSearchBox;
    public void setMenuSearchBox1() throws InterruptedException {
        menu.click();
        sleep(2);
        menuSearchBox.sendKeys("Arizona", Keys.ENTER);
    }
    public void setMenuSearchBox2() throws InterruptedException {
        menu.click();
        sleep(2);
        menuSearchBox.sendKeys("California", Keys.ENTER);
    }
}
