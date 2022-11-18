package com.demoqa.pages.interactions;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizablePage extends Methods {

    By resize = By.className("react-resizable-handle");

    public ResizablePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void resizableClick(int i, int width, int height) {
        javaExecutorScrollIntoView(resize);
        dragAndDropByOffsetWithIndex(resize, i, width, height);
    }

    @Step
    public void firstResize(int i, int width, int height) {
        javaExecutorScrollIntoView(resize);
        dragAndDropByOffsetWithIndex(resize, i, width, height);
        int max_width = 500, min_width = 150;
        int max_height = 300, min_height = 150;
        if (width < min_width || width > max_width) {
            System.out.println("Width can not be bigger than 500 or smaller than 150");
        } else if (height < min_height || height > max_height) {
            System.out.println("Height can not be bigger than 300 or smaller than 150");
        }
    }
}
