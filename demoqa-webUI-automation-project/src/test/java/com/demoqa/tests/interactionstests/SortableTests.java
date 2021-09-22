package com.demoqa.tests.interactionstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableTests extends BaseTests {
    @Test
    public void sortablePageTest(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Sortable");
        Assert.assertEquals(methods.getTitleName(),"Sortable");
        waitTime();
        sortablePage.clickListOrGrid("List");
        sortablePage.sortElementsList("One",5);
        sortablePage.sortElementsList("Two",4);
    }
    @Test
    public void sortableElementsListTest(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Sortable");
        Assert.assertEquals(methods.getTitleName(),"Sortable");
        waitTime();
        sortablePage.clickListOrGrid("List");
        sortablePage.dragAndDropASCAndDESC(0);
        waitTime();
        sortablePage.dragAndDropASCAndDESC(5);
    }
    @Test
    public void sortableElementsGridTest(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Sortable");
        Assert.assertEquals(methods.getTitleName(),"Sortable");
        waitTime();
        sortablePage.clickListOrGrid("Grid");
        sortablePage.sortElementsGrid(0,5);
        sortablePage.sortElementsGrid(1,4);
    }
}
