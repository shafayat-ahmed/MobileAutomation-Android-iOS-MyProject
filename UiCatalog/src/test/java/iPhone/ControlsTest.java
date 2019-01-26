package iPhone;

import Controls.Controls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Controls {
    Controls controls;
    @BeforeMethod
    public void setUp(){
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testButton1() throws InterruptedException {
        controls.showPageControl();
    }
    @Test
    public void testButton2() throws InterruptedException {
        controls.showSlider();
    }
    @Test
    public void testButton3() throws InterruptedException {
        controls.showSwitch();
    }
}
