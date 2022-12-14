package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTests extends BaseTests {
    @Test
    public void webTablesTest() {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Web Tables");
        Assert.assertEquals(methods.getTitleName(), "Web Tables");
        webTablesPage.clickAddButton();
        Assert.assertEquals(webTablesPage.titleRegistrationForm(), "Registration Form");
        webTablesPage.enterFirstName("Natasha");
        webTablesPage.enterLastName("Kostovska");
        webTablesPage.enterEmail("nate@test.com");
        webTablesPage.enterAge("25");
        webTablesPage.enterSalary("10000");
        webTablesPage.enterDepartment("QA");
        webTablesPage.clickSubmit();
        webTablesPage.clickAddButton();
        webTablesPage.enterFirstName("Natash");
        webTablesPage.enterLastName("Kostovsk");
        webTablesPage.enterEmail("nate@test.com");
        webTablesPage.enterAge("25");
        webTablesPage.enterSalary("10000");
        webTablesPage.enterDepartment("QA");
        webTablesPage.clickSubmit();
        webTablesPage.clickAddButton();
        webTablesPage.enterFirstName("Natas");
        webTablesPage.enterLastName("Kostovs");
        webTablesPage.enterEmail("nate@test.com");
        webTablesPage.enterAge("25");
        webTablesPage.enterSalary("10000");
        webTablesPage.enterDepartment("QA");
        webTablesPage.clickSubmit();
        webTablesPage.selectRows("5");
        webTablesPage.enterPageNumber("1");
        webTablesPage.clickNextPage();
        webTablesPage.clickPreviousPage();
        webTablesPage.deleteEntryFromTable(1);
        webTablesPage.editEntryFromTable(0);
        webTablesPage.clickSubmit();
        webTablesPage.typeToSearch("Kierra");
    }
}
