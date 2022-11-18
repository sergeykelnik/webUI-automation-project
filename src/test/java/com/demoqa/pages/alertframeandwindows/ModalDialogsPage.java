package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends Methods {

    By smallModalButton = By.id("showSmallModal");
    By largeModalButton = By.id("showLargeModal");
    By smallResponse = By.id("example-modal-sizes-title-sm");
    By largeResponse = By.id("example-modal-sizes-title-lg");
    By closeSmallModal = By.id("closeSmallModal");
    By closeLargeModal = By.id("closeLargeModal");
    By okSmallModal = By.id("closeSmallModal-ok");

    public ModalDialogsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickSmallModal() {
        click(smallModalButton);
    }

    @Step
    public void clickLargeModal() {
        click(largeModalButton);
    }

    @Step
    public void clickCloseSmallModal() {
        click(closeSmallModal);
    }

    @Step
    public String smallModalResponse() {
        return getText(smallResponse);
    }

    @Step
    public String largeModalResponse() {
        return getText(largeResponse);
    }

    @Step
    public void clickCloseLargeModal() {
        click(closeLargeModal);
    }

    @Step
    public void setOKSmallModal() {
        click(okSmallModal);
    }
}