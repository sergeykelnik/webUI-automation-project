package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends BaseTests {

    @Test
    public void newTabWindowTest() {
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Browser Windows");
        browserWindowPage.click_new_tab();
          System.out.println("OLD WINDOW: " + methods.getCurrentTab());
        browserWindowPage.click_new_tab();
        System.out.println("FOCUS WINDOW: " + methods.getCurrentTab());
        System.out.println("ALL WINDOWS: " + methods.get_all_tabs());
        browserWindowPage.switch_to_tab(methods.get_all_tabs(), 1);
        System.out.println("CURRENT WINDOW: " + methods.getCurrentTab());
        browserWindowPage.switch_to_tab(methods.get_all_tabs(), 0);
    }

    @Test
    public void newWindowTest() {
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Browser Windows");
           browserWindowPage.click_new_window();
            methods.switch_to_window(methods.get_all_tabs(), 1);
        Assert.assertEquals(browserWindowPage.returnNewWindowTitle(), "This is a sample page");
             methods.switch_to_window(methods.get_all_tabs(), 0);
        System.out.println("Main window: "+methods.getCurrentTab());
        browserWindowPage.click_new_window();
           methods.switch_to_window(methods.get_all_tabs(), 1);
        System.out.println("Maximized window: "+methods.getCurrentTab());
           methods.switch_to_window(methods.get_all_tabs(), 2);
        System.out.println("Small window: "+methods.getCurrentTab());
    }
    @Test
    public void newMessageTest(){
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Browser Windows");
             browserWindowPage.clickNewMessage();
              methods.switch_to_window(methods.get_all_tabs(),0);
        System.out.println("Main Window: "+methods.getCurrentTab());
             methods.switch_to_window(methods.get_all_tabs(),1);
        System.out.println("Message Window again: "+methods.getCurrentTab());
    }
}
