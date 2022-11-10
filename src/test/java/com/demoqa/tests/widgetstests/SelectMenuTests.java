package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectMenuTests extends BaseTests {
    @Test
    public void selectMenuPageTest() {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Select Menu");
        Assert.assertEquals(methods.getTitleName(), "Select Menu");
        selectMenuPage.selectValue("Group 2, option 2");
        selectMenuPage.selectOne("Other");
        selectMenuPage.oldStyleSelect("Purple");
        selectMenuPage.oldStyleSelectWithIndex(2);
        // red and from 1 to 10
        selectMenuPage.oldStyleSelectWithValue("5");
        selectMenuPage.multiSelectDropDown("Black");
        selectMenuPage.multiSelectDropDown("Green");
    }

    @Test
    public void standardMultiSelect() {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Select Menu");
        selectMenuPage.multiSelectOptions();
        selectMenuPage.standardMultiSelect("volvo");
        selectMenuPage.standardMultiSelect("opel");
        selectMenuPage.standardMultiSelect("audi");
        selectMenuPage.allSelectedOptions();
        selectMenuPage.deselectStandardMultiSelect("volvo");
        selectMenuPage.deselectAllStandardMultiSelect();

    }
}
