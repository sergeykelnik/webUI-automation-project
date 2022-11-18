package com.demoqa.pages.interactions;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectablePage extends Methods {

    By listOrGrid = By.xpath("//*[@href=\"#\"]");
    By listItems = By.xpath("//*[contains(@class,\"mt-2\")]");
    By gridItems = By.xpath("//*[contains(@class,\"list-group-horizontal-sm\")]/li");

    public SelectablePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickSelectableMenu(String menu) {
        int i = arrayListToInt(StaticVariables.SORTABLE_MENU, menu);
        clickWithIndex(listOrGrid, i);
    }

    @Step
    public void selectListOptions(int index) {
        keyDownControlActions(listItems, index);
    }

    @Step
    public void selectGridOptions(int index) {
        keyDownControlActions(gridItems, index);
    }
}