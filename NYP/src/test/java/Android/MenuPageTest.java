package Android;

import BreakingNews.HomePageMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import common.Base;
import org.testng.annotations.Test;
public class MenuPageTest extends Base {
    HomePageMenu homePageMenu;
    @BeforeMethod
    public void initElements(){
        homePageMenu = PageFactory.initElements(ad, HomePageMenu.class);
    }
    @Test
    public void sportsTest(){
        homePageMenu.setSports();
    }
    @Test
    public void pageSixTest(){
        homePageMenu.setPageSix();
    }
    @Test
    public void menuSearchBoxTest(){
        homePageMenu.setMenuSearchBox();
    }
    @Test
    public void topNewsTest(){
        homePageMenu.setTopNews();
    }
    @Test
    public void menuNewsTest(){
        homePageMenu.setMenuNews();
    }
    @Test
    public void notificationTest(){
        homePageMenu.setNotifications();
    }
    @Test
    public void signUpTest(){
        homePageMenu.setSignUp();
    }
    @Test
    public void photoTest(){
        homePageMenu.setPhotos();
    }
    @Test
    public void photo1Test(){
        homePageMenu.setPhotos1();
    }
    @Test
    public void photo2Test(){
        homePageMenu.setPhoto2();
    }
    @Test
    public void BreakingNewsNotificationTest(){
        homePageMenu.setBreakingNewsNotification();
    }
    @Test
    public void PageSixNotificationsTest(){
        homePageMenu.setPageSixNotifications();
    }
    @Test
    public void SportsNotificationsTest(){
        homePageMenu.setSportsNotifications();
    }
    @Test
    public void EditorPickNotificationsTest(){
        homePageMenu.setEditorPickNotifications();
    }
    @Test
    public void NewYorkMetroNotificationsTest(){
        homePageMenu.setNewYorkMetroNotifications();
    }
}
