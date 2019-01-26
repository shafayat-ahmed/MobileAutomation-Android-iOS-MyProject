package Settings;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settingsPage.Settings;
public class SettingsPageTest extends Settings {
    Settings settings;
    @BeforeMethod
    public void initElements(){
        settings = PageFactory.initElements(ad, Settings.class);
    }
    @Test
    public void settingsTest1() throws InterruptedException {
        settings.setSignUp();
    }
    @Test
    public void settingsTest2() throws InterruptedException {
        settings.privacyPolicy();
    }
    @Test
    public void settingsTest3() throws InterruptedException {
        settings.termsAndConditions();
    }
}
