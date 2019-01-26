package iPhone;

import Buttons.Buttons;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest extends Buttons {
    Buttons buttons;
    @BeforeMethod
    public void setUp(){
        buttons = PageFactory.initElements(ad, Buttons.class);
    }
    @Test
    public void testButton1(){
        buttons.showBackgroundImage();
    }
    @Test
    public void testButton2(){
        buttons.showButtonWithImage();
    }
    @Test
    public void testButton3(){
        buttons.showRoundedButton();
    }
}
