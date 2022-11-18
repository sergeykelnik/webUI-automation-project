package com.demoqa.pages.interactions;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortablePage extends Methods {
    By interactionsMenu = By.xpath("//*[contains(@class,\"collapse show\")]/ul/li");
    By listOrGrid = By.xpath("//*[@href=\"#\"]");
    By list = By.xpath("//*[contains(@class,\"vertical-list-container \")]/div");
    By grid = By.xpath("//*[contains(@class,\"create-grid\")]/div");

    public SortablePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void chooseInteractionsMenu(String interactionsMenuList) {
        int i = arrayListToInt(StaticVariables.INTERACTIONS_MENU, interactionsMenuList);
        javaExecutorScrollIntoView(interactionsMenu);
        clickWithIndex(interactionsMenu, i);
    }

    @Step
    public void clickListOrGrid(String chooseListOrGrid) {
        int i = arrayListToInt(StaticVariables.SORTABLE_MENU, chooseListOrGrid);
        clickWithIndex(listOrGrid, i);
    }

    @Step
    public void sortElementsList(String number, int index) {
        int i = arrayListToInt(StaticVariables.LIST, number);
        javaExecutorScrollIntoView(list);
        dragAndDropWebElements(list, list, i, index);

    }

    @Step
    public void dragAndDropASCAndDESC(int index) {
        if (index == 0) {
            for (int j = 5; j >= 0; j--) {
                dragAndDropWebElements(list, list, index, j);
            }
        } else if (index == 5) {
            for (int j = 0; j < 5; j++) {
                dragAndDropWebElements(list, list, index, j);
            }
        }
    }

    @Step
    public void sortElementsGrid(int index, int index2) {
        javaExecutorScrollIntoView(grid);
        dragAndDropWebElements(grid, grid, index, index2);
    }
}
