package com.demoqa.tests.loadertests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoaderTests extends BaseTests {
    @Test
    public void testLoader(){
        driver.navigate().to(URL1);
        loaderPage.clickRunButton();
        methods.switchToFrameByName("iframeResult");
        loaderPage.loaderToBeInvisible();
        Assert.assertEquals(loaderPage.getPageText(),"Tada!\nSome text in my newly loaded page..");
    }
}
