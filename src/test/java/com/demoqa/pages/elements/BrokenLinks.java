package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks extends Methods {

    By images = By.xpath("//*[contains(@src,\"/images/Toolsqa\")]");
    By links = By.xpath("//*[contains(text(),\"Click Here for\")]");
    By brokenLink = By.xpath("//*[text()[contains(.,'500')]]");
    public BrokenLinks(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickImages(int i) {
        clickWithIndex(images, i);
    }

    @Step
    public void clickLinks(int i) {
        javaExecutorScrollIntoView(links);
        clickWithIndex(links, i);
    }

    @Step
    public String brokenLinkResponse() {
        return getText(brokenLink);
    }
}