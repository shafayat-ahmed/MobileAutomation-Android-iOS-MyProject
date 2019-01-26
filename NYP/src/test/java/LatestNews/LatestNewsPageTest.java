package LatestNews;

import latestNewsPage.LatestNews;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LatestNewsPageTest extends LatestNews {
    LatestNews latestNews;
    @BeforeMethod
    public void initElements() {
        latestNews = PageFactory.initElements(ad, LatestNews.class);
    }
    @Test
    public void latestNewsTest1() throws InterruptedException {
        latestNews.setTopNews1();
    }
    @Test
    public void latestNewsTest2() throws InterruptedException {
        latestNews.setTopNews2();
    }
}