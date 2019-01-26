package Tech;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import techPage.Tech;

public class TestTechPage extends Tech {
    Tech techPage;
    @BeforeMethod
    public void initElements(){
        techPage = PageFactory.initElements(ad, Tech.class);
    }
    @Test
    public void testTech1(){
        techPage.getTech1();
    }
    @Test
    public void testTech2(){
        techPage.getTech2();
    }
    @Test
    public void testTech3(){
        techPage.getTech3();
    }
    @Test
    public void testTech4(){
        techPage.getTech4();
    }
    @Test
    public void testTech5(){
        techPage.getTech5();
    }

}
