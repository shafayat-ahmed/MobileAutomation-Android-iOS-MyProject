package iPhone;

import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class NavigateUiTest extends NavigateUi {
    NavigateUi navigateUi;
    @BeforeMethod
    public void initElements(){
        navigateUi= PageFactory.initElements(ad, NavigateUi.class);
    }
       @Test
    public void testNavigateUi(){
        navigateUi.home();
       }
}
