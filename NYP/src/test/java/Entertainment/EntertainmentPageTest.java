package Entertainment;

import entertainmentPage.Entertainment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntertainmentPageTest extends Entertainment {
    Entertainment entertainment;
    @BeforeMethod
    public void initElements(){
        entertainment = PageFactory.initElements(ad, Entertainment.class);
    }
    @Test
    public void entertainmentTest1() throws InterruptedException {
        entertainment.setEntertainment1();
    }
    @Test
    public void entertainmentTest2() throws InterruptedException {
        entertainment.setEntertainment2();
    }
}
