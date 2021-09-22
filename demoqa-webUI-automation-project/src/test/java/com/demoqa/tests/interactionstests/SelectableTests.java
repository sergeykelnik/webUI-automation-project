package com.demoqa.tests.interactionstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectableTests extends BaseTests {
    @Test
    public void selectableListTest(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Selectable");
        Assert.assertEquals(methods.getTitleName(),"Selectable");
        waitTime();
        selectablePage.clickSelectableMenu("List");
        selectablePage.selectListOptions(0);
        selectablePage.selectListOptions(2);
    }
    @Test(priority = -1)
    public void selectableGridTest(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Selectable");
        Assert.assertEquals(methods.getTitleName(),"Selectable");
        waitTime();
        selectablePage.clickSelectableMenu("Grid");
        selectablePage.selectGridOptions(0);
        selectablePage.selectGridOptions(4);
        selectablePage.selectGridOptions(8);
    }
}
