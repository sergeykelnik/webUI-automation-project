package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends Methods {

    By fullName = By.id("userName");
    By mail = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");
    By assertion = By.className("mb-1");

    public TextBoxPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public String assertionResponse(String response) {
        int i = ArrayUtils.indexOf(StaticVariables.RESPONSES, response);
        return getTexts(assertion, i);
    }

    @Step
    public void enterFullName(String credentials) {
        sendKeys(fullName, credentials);
    }

    @Step
    public void enterMail(String eMail) {
        sendKeys(mail, eMail);
    }

    @Step
    public void enterCAddress(String address) {
        sendKeys(currentAddress, address);
    }

    @Step
    public void enterPAddress(String address) {
        sendKeys(permanentAddress, address);
    }

    @Step
    public void clickSubmit() {
        click(submit);
    }
}