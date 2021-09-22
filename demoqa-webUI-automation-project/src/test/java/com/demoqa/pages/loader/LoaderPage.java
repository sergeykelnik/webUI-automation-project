package com.demoqa.pages.loader;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoaderPage extends Methods {

    public LoaderPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    By loader = By.className("loader");
    By button = By.id("runbtn");
    By text = By.id("myDiv");

    public void clickRunButton() {
        click(button);
    }

    public String getPageText() {
        return getText(text);
    }

    public void loaderToBeInvisible() {
        loader(loader);
    }
}
