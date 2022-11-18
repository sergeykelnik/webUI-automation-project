package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage extends Methods {

    By frame1 = By.id("frame1");
    By frame2 = By.id("frame2");
    By frameHeading1 = By.id("sampleHeading");
    By mainWindowText = By.xpath("//*[contains(text(),\"Sample\")]");

    public FramesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void switchToFrame1() {
        switchToFrame(frame1);
    }

    @Step
    public String frameTitle() {
        return getText(frameHeading1);
    }

    @Step
    public void switchToFrame2() {
        switchToFrame(frame2);
    }

    @Step
    public String getMainText() {
        return getText(mainWindowText);
    }
}