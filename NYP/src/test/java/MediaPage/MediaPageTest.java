package MediaPage;

import mediaPage.Media;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MediaPageTest extends Media
{
    Media media;
    @BeforeMethod
    public void initElements(){
        media = PageFactory.initElements(ad, Media.class);
    }
    @Test
    public void mediaTest1() throws InterruptedException {
        media.setMedia();
    }
}
