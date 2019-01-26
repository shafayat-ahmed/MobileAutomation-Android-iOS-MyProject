package Business;
import businessPage.Business;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BusinessPageTest extends Business {
    Business business;
    @BeforeMethod
    public void initElements(){
        business = PageFactory.initElements(ad, Business.class);
    }
    @Test
    public void livingTest1() throws InterruptedException {
        business.setBusiness();
    }
    @Test
    public void businessTest1() throws InterruptedException {
        business.setBusinessNews1();
    }
    @Test
    public void businessTest2() throws InterruptedException {
        business.setBusinessNews2();
    }
    @Test
    public void businessTest3() throws InterruptedException {
        business.setBusinessNews3();
    }
    @Test
    public void businessTest4() throws InterruptedException {
        business.setBusinessNews4();
    }
    @Test
    public void businessTest5() throws InterruptedException {
        business.setBusinessNews5();
    }
    @Test
    public void businessTest6() throws InterruptedException {
        business.setBusinessNews6();
    }
}
