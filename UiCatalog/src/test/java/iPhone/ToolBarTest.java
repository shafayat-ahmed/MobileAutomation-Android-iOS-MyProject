package iPhone;

import Toolbar.Toolbar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ToolBarTest extends Toolbar {
    Toolbar toolbar;
    @BeforeMethod
    public void initElements(){
        toolbar = PageFactory.initElements(ad, Toolbar.class);
    }
    @Test
        public void testImageButton(){
            toolbar.clickOnImageButton();}
    @Test
    public void imageTest(){
        toolbar.setImage();
    }
    @Test
    public void tintedTest(){
        toolbar.setTinted();
    }
    @Test
    public void styleDefaultTest(){
        toolbar.setStyleDefault();
    }
    @Test
    public void styleBlackTest(){
        toolbar.setStyleBlack();
    }
    @Test
    public void styleTranslucient(){
        toolbar.setStyleTranslucent();
    }
    @Test
    public void doneTest(){
        toolbar.setDone();
    }
    @Test
    public void item1Test(){
        toolbar.setItem1();
    }
    @Test
    public void item2Test(){
        toolbar.setItme2();
    }
    @Test
    public void toolsTest(){
        toolbar.setTools();
    }
}

