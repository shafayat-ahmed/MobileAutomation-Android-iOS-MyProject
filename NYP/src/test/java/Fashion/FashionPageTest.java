package Fashion;

import fashionPage.Fashion;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FashionPageTest extends Fashion{
    Fashion fashion;
    @BeforeMethod
    public void initElements(){
        fashion = PageFactory.initElements(ad, Fashion.class);
    }
    @Test
    public void fashionTest1() throws InterruptedException {
        fashion.setFashion1();
    }
    @Test
    public void fashionTest2() throws InterruptedException {
        fashion.setFashion2();
    }
}
