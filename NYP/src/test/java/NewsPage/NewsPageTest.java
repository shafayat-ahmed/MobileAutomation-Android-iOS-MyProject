package NewsPage;

import newsPage.News;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageTest extends News{
    News news;
    @BeforeMethod
    public void initElements(){
        news = PageFactory.initElements(ad, News.class);
    }
    @Test
    public void newsTest1() throws InterruptedException {
       news.setNews();
    }
}
