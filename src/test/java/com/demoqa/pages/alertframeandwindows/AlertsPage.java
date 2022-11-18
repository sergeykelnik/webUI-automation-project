package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends Methods {

    By alertButton = By.id("alertButton");
    By timerAlert = By.id("timerAlertButton");
    By confirmButton = By.id("confirmButton");
    By promptButton = By.id("promtButton");
    By confirmResult = By.id("confirmResult");
    By promptResult = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickAlertButton() {
        click(alertButton);
    }

    @Step
    public void clickUntilAlertIsPresent() {
        click(timerAlert);
        alertIsPresent();
    }

    @Step
    public void clickConfirmButton() {
        click(confirmButton);
    }

    @Step
    public String confirmButtonResponse() {
        return getText(confirmResult);
    }

    @Step
    public void clickPromptButton() {
        click(promptButton);
    }

    @Step
    public void enterPromptData(String enterName) {
        switchToAlert().sendKeys(enterName);
    }

    @Step
    public String promptResultResponse() {
        return getText(promptResult);
    }
}
