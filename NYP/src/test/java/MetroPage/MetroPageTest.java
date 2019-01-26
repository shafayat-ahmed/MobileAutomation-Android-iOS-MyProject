package MetroPage;

import metroPage.Metro;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MetroPageTest extends Metro {
   Metro metro;
    @BeforeMethod
    public void initElements(){
        metro = PageFactory.initElements(ad, Metro.class);
    }
    @Test
    public void metroTest1() throws InterruptedException {
        metro.setMetro();
    }
}
