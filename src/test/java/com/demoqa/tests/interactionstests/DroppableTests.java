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
        droppablePage.chooseDroppableMenu("Accept");
        droppablePage.acceptableDragAndDrop();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
        droppablePage.notAcceptableDragAndDrop();
    }

    @Test
    public void acceptMenuNotAcceptable() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Accept");
        droppablePage.notAcceptableDragAndDrop();
    }

    @Test
    public void preventPropogationMenuOuter() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Prevent Propogation");
        droppablePage.outerDroppable(1);
    }

    @Test
    public void preventPropogationMenuInner() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Prevent Propogation");
        droppablePage.innerDroppable(1);
    }

    @Test
    public void revertDraggableMenu() {
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Revert Draggable");
        droppablePage.willRevertDraggable();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
        droppablePage.notRevertDraggable();
        Assert.assertEquals(droppablePage.getText(), "Dropped!");
    }
}
