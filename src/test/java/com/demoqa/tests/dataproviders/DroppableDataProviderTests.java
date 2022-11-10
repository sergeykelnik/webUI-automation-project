package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DroppableDataProviderTests extends BaseTests {
    @DataProvider(name = "preventPropogationMenu")
        public static Object [][] dataProvider(){
            return new Object[][]{
                    {0,0},
                    {1,1},
            };
        }
    @Test(dataProvider = "preventPropogationMenu")
    public void innerOuterPreventPropogation(int indexInner,int indexOutter){
        homePage.chooseHomePageMenu("Interactions");
        sortablePage.chooseInteractionsMenu("Droppable");
        droppablePage.chooseDroppableMenu("Prevent Propogation");
        droppablePage.innerDroppable(indexInner);
        droppablePage.outerDroppable(indexOutter);
    }
}
