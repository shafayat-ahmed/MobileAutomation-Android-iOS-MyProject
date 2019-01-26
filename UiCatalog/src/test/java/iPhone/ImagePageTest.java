package iPhone;

import Imges.Images;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ImagePageTest extends Images {
    Images images;
    @BeforeMethod
    public void initElements(){
        images= PageFactory.initElements(ad, Images.class);}

    @Test
    public void testActionSheetSimple() throws InterruptedException {
        images.clickOnDuration();
    }
    @Test
    public void testMountainImage(){
        images.clickOnImage();
    }
}

