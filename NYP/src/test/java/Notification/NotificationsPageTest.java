package Notification;

import notificationsPage.Notifications;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotificationsPageTest extends Notifications {
    Notifications notifications;
    @BeforeMethod
    public void initElements(){
        notifications = PageFactory.initElements(ad, Notifications.class);
    }
    @Test
    public void notificationsTest1() throws InterruptedException {
        notifications.setNotifications();
    }
    @Test
    public void notificationsTest2() throws Exception {
        notifications.setBreakingNewsNotification();
    }
    @Test
    public void notificationsTest3() throws Exception {
       notifications.setNewYorkMetroNotifications();
    }
    @Test
    public void notificationsTest4() throws InterruptedException {
       notifications.setSportsNotifications();
    }
    @Test
    public void notificationsTest5() throws InterruptedException {
        notifications.setEditorPickNotifications();
    }
    @Test
    public void setNotificationsTest6() throws InterruptedException {
        notifications.setPageSixNotifications();
    }

}

