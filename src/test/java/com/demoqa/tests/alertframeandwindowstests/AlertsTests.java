package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {
    @Test
    public void alertButtonsTests() {
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Alerts");
        alertsPage.clickAlertButton();
        methods.acceptAlert();
        alertsPage.clickUntilAlertIsPresent();
        methods.acceptAlert();
        alertsPage.clickConfirmButton();
        methods.dismissAlert();
        Assert.assertEquals(alertsPage.confirmButtonResponse(), "You selected Cancel");
        alertsPage.clickPromptButton();
        alertsPage.enterPromptData("Natasha");
        methods.acceptAlert();
        Assert.assertEquals(alertsPage.promptResultResponse(), "You entered Natasha");
    }
}
