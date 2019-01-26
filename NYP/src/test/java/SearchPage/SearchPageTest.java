package SearchPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchPage.Search;
public class SearchPageTest extends Search {
    Search search;
    @BeforeMethod
    public void initElements(){
        search = PageFactory.initElements(ad, Search.class);
    }
    @Test
    public void searchTest1() throws InterruptedException {
        search.setMenuSearchBox1();
    }
    @Test
    public void searchTest2() throws InterruptedException {
        search.setMenuSearchBox2();
    }
}
