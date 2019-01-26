package OpinionPage;

import opinionPage.Opinion;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpinionPageTest extends Opinion {
    Opinion opinion ;
    @BeforeMethod
    public void initElements(){
        opinion= PageFactory.initElements(ad, Opinion.class);
    }
    @Test
    public void opinionTest1() throws InterruptedException {
        opinion.setOpinion();
    }
}
