package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenuPage extends Methods {

    By selectValue = By.id("react-select-2-input");
    By selectOne = By.id("react-select-3-input");
    By oldStyle = By.id("oldSelectMenu");
    By standard = By.id("cars");
    By dropDown = By.id("react-select-4-input");

    public SelectMenuPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void oldStyleSelect(String color) {
        selectByVisibleText(oldStyle, color);
    }

    @Step
    //same method select with index
    public void oldStyleSelectWithIndex(int index) {
        selectWithIndex(oldStyle, index);
    }

    @Step
    //same method select by value
    public void oldStyleSelectWithValue(String value) {
        selectByValue(oldStyle, value);
    }

    @Step
    public void multiSelectOptions() {
        getOptions(standard);
    }

    @Step
    public void allSelectedOptions() {
        getAllSelectedOptions(standard);
    }

    @Step
    public void standardMultiSelect(String car) {
        if (selectIsMultiple(standard)) {
            javaExecutorScrollIntoView(standard);
            selectByValue(standard, car);
        } else {
            System.out.println("No multi-select option");
        }
    }

    @Step
    public void deselectStandardMultiSelect(String deselectCar) {
        deselectByValue(standard, deselectCar);
    }

    @Step
    public void deselectAllStandardMultiSelect() {
        deselectAll(standard);
    }

    @Step
    public void multiSelectDropDown(String color) {
        sendKeysEnter(dropDown, color);
    }

    @Step
    public void selectValue(String value) {
        sendKeysEnter(selectValue, value);
    }

    @Step
    public void selectOne(String one) {
        sendKeysEnter(selectOne, one);
    }
}