package PhotoPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import photosPage.Photos;
public class PhotosPageTest extends Photos {
    Photos photos;
    @BeforeMethod
    public void initElements(){
        photos = PageFactory.initElements(ad, Photos.class);
    }
    @Test
    public void photosTest1() throws InterruptedException {
        photos.setPhotos1();
    }
    @Test
    public void photosTest2() throws InterruptedException {
        photos.setPhotos2();
    }
    @Test
    public void photosTest3() throws InterruptedException {
        photos.setPhotos3();
    }
}
