package com.demoqa.pages.bookstoreapplication;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage extends Methods {

    By bookStoreApp = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By searchBox = By.id("searchBox");
    By selectRows = By.tagName("select");
    By pages = By.xpath("//*[@type=\"number\"]");
    By title = By.cssSelector("div.action-buttons > span > a");
    By backButton = By.id("addNewRecordButton");
    By next = By.xpath("//button[text()=\"Next\"]");
    By previous = By.xpath("//button[text()=\"Previous\"]");
    By loginButton = By.id("login");
    public BookStorePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void chooseBookStoreMenu(String elementsMenuList) {
        int i = arrayListToInt(StaticVariables.BOOKSTORE_MENU, elementsMenuList);
        javaExecutorScrollIntoView(bookStoreApp);
        clickWithIndex(bookStoreApp, i);
    }

    @Step
    public void searchbox(String book) {
        sendKeys(searchBox, book);
    }

    @Step
    public void select(String rows) {
        getOptions(selectRows);
        selectByValue(selectRows, rows);
    }

    @Step
    public void numberOfPages(String num) {
        sendKeys(pages, num);
    }

    @Step
    public void openBookByTitle(String book) {//list of the books array
        int i = arrayListToInt(StaticVariables.BOOKS_LIST, book);
        javaExecutorScrollIntoView(title);
        clickWithIndex(title, i);
    }

    @Step
    public void clickBackToBookstore() {
        javaExecutorScrollIntoView(backButton);
        clickActions(backButton);
    }

    @Step
    public void clickNextPage() {
        clickActions(next);
    }

    @Step
    public void clickPreviousPage() {
        clickActions(previous);
    }

    @Step
    public void clickLoginButton() {
        moveToElement(loginButton);
        clickActions(loginButton);
    }
}