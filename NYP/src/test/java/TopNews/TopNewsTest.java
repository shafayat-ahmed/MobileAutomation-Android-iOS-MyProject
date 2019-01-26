package TopNews;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TopNewsTest extends TopNews {
    TopNews topNews;
    @BeforeMethod
    public void initElements(){
        topNews = PageFactory.initElements(ad, TopNews.class);
    }
    @Test
    public void topNewsTest(){
        topNews.setTopNews();
    }
}
