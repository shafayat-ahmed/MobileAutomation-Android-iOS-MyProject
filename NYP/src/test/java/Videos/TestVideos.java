package Videos;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import videoPage.Videos;
public class TestVideos extends Videos{
    Videos videos;
    @BeforeMethod
    public void initElements(){
        videos = PageFactory.initElements(ad, Videos.class);
    }
    @Test
    public void videosTest1() throws InterruptedException {
        videos.setVideoNews1();
    }
    @Test
    public void videosTest2() throws InterruptedException {
        videos.setVideoNews2();
    }
    @Test
    public void videosTest3() throws InterruptedException {
        videos.setVideoNews3();
    }
    @Test
    public void videoTest4() throws InterruptedException {
        videos.setVideoNews4();
    }
}
