package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends Methods {

    By buttons = By.xpath("//*[contains(@class,\"btn-primary\")]");
    By text = By.xpath("//*[contains(text(),\"This text has random Id\")]");
    By visibleAfter = By.id("visibleAfter");
    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickPage(int i) {
        element(visibleAfter);
        clickWithIndex(buttons, i);
    }

    @Step
    public String text() {
        return getText(text);
    }
}