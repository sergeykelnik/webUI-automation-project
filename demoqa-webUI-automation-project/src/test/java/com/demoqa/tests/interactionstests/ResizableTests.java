package com.demoqa.tests.interactionstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class ResizableTests extends BaseTests {
    @Test
    public void secondResizableTest(){
        homePage.chooseHomePageMenu("Interactions");
        waitTime();
        sortablePage.chooseInteractionsMenu("Resizable");
        waitTime();
        resizablePage.resizableClick(1, 150,150);
    }
    @Test
    public void firstElementResizableTest(){
        homePage.chooseHomePageMenu("Interactions");
        waitTime();
        sortablePage.chooseInteractionsMenu("Resizable");
        resizablePage.firstResize(0,150,150);
    }
}
