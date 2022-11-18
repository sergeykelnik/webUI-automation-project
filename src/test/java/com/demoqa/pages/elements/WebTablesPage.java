package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends Methods {

    By add = By.id("addNewRecordButton");
    By registrationForm = By.id("registration-form-modal");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submit = By.id("submit");
    By searchBox = By.id("searchBox");
    By page = By.xpath("//*[contains(@type,\"number\")]");
    By selectRow = By.tagName("select");
    By deleteEntry = By.xpath("//*[contains(@title,\"Delete\")]");
    By editEntry = By.xpath("//*[contains(@title,\"Edit\")]");
    By next = By.xpath("//button[text()=\"Next\"]");
    By previous = By.xpath("//button[text()=\"Previous\"]");

    public WebTablesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickAddButton() {
        javaExecutorClick(add);
    }

    @Step
    public String titleRegistrationForm() {
        return getText(registrationForm);
    }

    @Step
    public void typeToSearch(String search) {
        sendKeys(searchBox, search);
    }

    @Step
    public void selectRows(String row) {
        getOptions(selectRow);
        selectByValue(selectRow, row);
    }

    @Step
    public void enterPageNumber(String pageNumber) {
        sendKeys(page, pageNumber);
    }

    @Step
    public void enterFirstName(String firstname) {
        sendKeys(firstName, firstname);
    }

    @Step
    public void enterLastName(String lastname) {
        sendKeys(lastName, lastname);
    }

    @Step
    public void enterEmail(String eMail) {
        sendKeys(email, eMail);
    }

    @Step
    public void enterAge(String enterYourAge) {
        sendKeys(age, enterYourAge);
    }

    @Step
    public void enterSalary(String enterYourSalary) {
        sendKeys(salary, enterYourSalary);
    }

    @Step
    public void enterDepartment(String enterYourDepartment) {
        sendKeys(department, enterYourDepartment);
    }

    @Step
    public void clickSubmit() {
        click(submit);
    }

    @Step
    public void clickNextPage() {
        click(next);
    }

    @Step
    public void clickPreviousPage() {
        click(previous);
    }

    @Step
    public void editEntryFromTable(int editItem) {
        clickWithIndex(editEntry, editItem);
    }

    @Step
    public void deleteEntryFromTable(int deleteItem) {
        clickWithIndex(deleteEntry, deleteItem);
    }
}