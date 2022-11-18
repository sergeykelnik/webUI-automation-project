package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends Methods {

    By ad = By.id("close-fixedban");
    By clickElementsItems = By.xpath("//*[contains(@class,\"collapse show\")]/ul/li");
    By clickMeButton = By.xpath("//*[@class=\"mt-4\"][2]/button");
    By responseDynamicClick = By.id("dynamicClickMessage");
    By doubleClickMe = By.id("doubleClickBtn");
    By getDoubleClickMeMessage = By.id("doubleClickMessage");
    By rightClick = By.id("rightClickBtn");
    By rightClickResponse = By.id("rightClickMessage");

    public ButtonsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickClickMeButton() {
        click(clickMeButton);
    }

    @Step
    public String responseClickMe() {
        return getText(responseDynamicClick);
    }

    @Step
    public void doubleClickMeButton() {
        doubleClick(doubleClickMe);
    }

    @Step
    public String doubleClickResponse() {
        return getText(getDoubleClickMeMessage);
    }

    @Step
    public void rightClickButton() {
        rightClick(rightClick);
    }

    @Step
    public String getRightClickResponse() {
        return getText(rightClickResponse);
    }

    @Step
    public void chooseElementsMenu(String elementsMenuList) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_MENU, elementsMenuList);
        javaExecutorScrollIntoView(clickElementsItems);
        clickActionsWithIndex(clickElementsItems, i);
    }
}