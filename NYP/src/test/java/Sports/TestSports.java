package Sports;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sportsPage.Sports;
public class TestSports extends Sports {
    Sports sports;
    @BeforeMethod
    public void initElements(){
        sports = PageFactory.initElements(ad, Sports.class);
    }
    @Test
    public void sportsTest1() throws InterruptedException {
        sports.setSportsNews1();
    }
    @Test
    public void sportsTest2() throws InterruptedException {
        sports.setSportsNews2();
    }
    @Test
    public void sportsTest3() throws InterruptedException {
        sports.setSportsNews3();
    }
    @Test
    public void sportsTest4() throws InterruptedException {
        sports.setSportsNews4();
    }
    @Test
    public void sportsTest5() throws InterruptedException {
        sports.setSportsNews5();
    }
    @Test
    public void sportsTest6() throws InterruptedException {
        sports.setSportsNews6();
    }
    @Test
    public void sportsTest7() throws InterruptedException {
        sports.setSportsNews7();
    }
    @Test
    public void sportsTest8() throws InterruptedException {
        sports.setSportsNews8();
    }
    @Test
    public void sportsTest9() throws InterruptedException {
        sports.setSportsNews9();
    }
    @Test
    public void sportsTest10() throws InterruptedException {
        sports.setSportsNews10();
    }
    @Test
    public void sportsTest11() throws InterruptedException {
        sports.setSportsNews11();
    }
    @Test
    public void sportsTest12() throws InterruptedException {
        sports.setSports2();
    }
}
