package RealEstatePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import realEstatePage.RealEstate;

public class RealEstatePageTest extends RealEstate {
   RealEstate realEstate;
    @BeforeMethod
    public void initElements(){
        realEstate = PageFactory.initElements(ad,RealEstate.class);
    }
    @Test
    public void realEstateTest1() throws InterruptedException {
        realEstate.setRealEstate();
    }
}
