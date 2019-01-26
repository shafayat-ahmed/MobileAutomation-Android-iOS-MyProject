package LivingPage;

import livingPage.Living;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LivingPageTest extends Living {
    Living living;
    @BeforeMethod
    public void initElements(){
        living = PageFactory.initElements(ad, Living.class);
    }
    @Test
    public void livingTest1() throws InterruptedException {
       living.setLiving();
    }
}
