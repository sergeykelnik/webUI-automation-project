package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class UploadAndDownloadPage extends Methods {

    By download = By.id("downloadButton");
    By upload = By.id("uploadFile");

    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickDownloadButton() {
        javaExecutorScrollIntoView(download);
        click(download);
    }

    @Step
    public void clickChooseFile(String pathOfFile) {
        javaExecutorScrollIntoView(upload);
        sendKeys(upload, new File(pathOfFile).getAbsolutePath());
    }
}