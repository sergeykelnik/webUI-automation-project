package com.demoqa.tests.interactionstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class DraggableTests extends BaseTests {
    @Test
    public void simpleDrag(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Dragabble");
        waitTime();
        draggablePage.chooseDraggableMenuItem("Simple");
        draggablePage.dragMeAction(260,164);
    }
    @Test
    public void restrictedAxis(){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Dragabble");
        waitTime();
        draggablePage.chooseDraggableMenuItem("Axis Restricted");
        waitTime();
        draggablePage.yAxisRestrictedDragAction(250,0);
        draggablePage.xAxisRestrictedDragAction(0,150);
    }
}
