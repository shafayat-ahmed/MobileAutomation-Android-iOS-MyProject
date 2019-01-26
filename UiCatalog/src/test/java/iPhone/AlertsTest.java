package iPhone;

import Alerts.Alerts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends Alerts {
    Alerts alerts;
    @BeforeMethod
    public void setUp(){
        alerts = PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testShowSimple1(){
        alerts.showSimple();
    }
    @Test
    public void testShowSimple2(){
        alerts.showOkCancel();
    }
    @Test
    public void testShowSimple3(){
        alerts.showCustom();
    }
    @Test
    public void testShowSimple4(){
        alerts.showSimpleAlerts();
    }
}
