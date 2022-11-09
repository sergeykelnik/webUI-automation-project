package com.demoqa.tests.interactionstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DroppableTests extends BaseTests {
    @Test
    public void droppablePageSimpleMenu() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Simple");
        droppablePage.simple();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
    }

    @Test
    public void acceptMenuAcceptable() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        waitTime();
        droppablePage.chooseDroppableMenu("Accept");
        waitTime();
        droppablePage.acceptableDragAndDrop();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
        waitTime();
        droppablePage.notAcceptableDragAndDrop();
    }

    @Test
    public void acceptMenuNotAcceptable() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        waitTime();
        droppablePage.chooseDroppableMenu("Accept");
        waitTime();
        droppablePage.notAcceptableDragAndDrop();
    }

    @Test
    public void preventPropogationMenuOuter() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        waitTime();
        droppablePage.chooseDroppableMenu("Prevent Propogation");
        waitTime();
        droppablePage.outerDroppable(1);
    }

    @Test
    public void preventPropogationMenuInner() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        waitTime();
        droppablePage.chooseDroppableMenu("Prevent Propogation");
        waitTime();
        droppablePage.innerDroppable(1);
    }

    @Test
    public void revertDraggableMenu() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        waitTime();
        droppablePage.chooseDroppableMenu("Revert Draggable");
        waitTime();
        droppablePage.willRevertDraggable();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
        droppablePage.notRevertDraggable();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
    }
}
