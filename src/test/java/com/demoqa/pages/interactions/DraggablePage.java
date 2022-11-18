package com.demoqa.pages.interactions;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraggablePage extends Methods {

    By dragMe = By.id("dragBox");
    By onlyX = By.id("restrictedX");
    By onlyY = By.id("restrictedY");
    By chooseContainer = By.xpath("//*[contains(text(),\"I'm contained within\")]");
    By restrictedContainerBox = By.id("containmentWrapper");
    By cursorCenter = By.id("cursorCenter");
    By cursorTopLeft = By.id("cursorTopLeft");
    By cursorBottom = By.id("cursorBottom");
    By menuItems = By.xpath("//*[contains(@href,\"#\")]");

    public DraggablePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void chooseDraggableMenuItem(String dragabbleMenuItem) {
        int i = arrayListToInt(StaticVariables.DRAGABBLE_MENU, dragabbleMenuItem);
        clickWithIndex(menuItems, i);
    }

    @Step
    public void dragMeAction(int x, int y) {
        dragAndDropByOffset(dragMe, x, y);
    }

    @Step
    public void yAxisRestrictedDragAction(int x, int y) {
        if (y == 0) {
            dragAndDropByOffset(onlyX, x, y);
        } else {
            System.out.println("Y axis is not 0.");
        }
    }

    @Step
    public void xAxisRestrictedDragAction(int x, int y) {
        if (x == 0) {
            dragAndDropByOffset(onlyY, x, y);
        } else {
            System.out.println("X axis is not 0.");
        }
    }
}