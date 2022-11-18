package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePage extends Methods {

    By autoMultiple = By.id("autoCompleteMultipleInput");
    By autoSingle = By.id("autoCompleteSingleInput");

    public AutoCompletePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void enterAutoMultipleColors(String color) {
        sendKeysEnter(autoMultiple, color);
    }

    @Step
    public void enterSingleColor(String color) {
        sendKeysEnter(autoSingle, color);
    }
}