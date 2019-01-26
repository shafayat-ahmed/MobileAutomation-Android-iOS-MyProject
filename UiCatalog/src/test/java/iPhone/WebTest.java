package iPhone;

import WebPage.Web;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTest extends Web {
    Web web;

    @BeforeMethod
    public void initElements()throws InterruptedException {
        web = PageFactory.initElements(ad, Web.class);}
    @Test
    public void testImageButton(){
        web.clickOnWeb();}
    }

