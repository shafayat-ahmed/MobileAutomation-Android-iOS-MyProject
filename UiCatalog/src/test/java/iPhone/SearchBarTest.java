package iPhone;

import SearchBar.SearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest extends SearchBar {
    SearchBar searchBar;
    @BeforeMethod
    public void initElements() {
        searchBar = PageFactory.initElements(ad, SearchBar.class);
    }

    @Test
    public void testSearchBar(){
        searchBar.clickOnSearchBar();
    }
}
