package PageSix;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageSixPage.PageSix;
public class PageSixPageTest extends PageSix{
    PageSix pageSix;
    @BeforeMethod
    public void initElements(){
        pageSix = PageFactory.initElements(ad, PageSix.class);
    }
    @Test
    public void pageSixTest1() throws InterruptedException {
       pageSix.setPageSix();
    }
}
