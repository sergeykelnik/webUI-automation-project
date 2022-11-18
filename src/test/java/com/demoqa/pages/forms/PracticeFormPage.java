package com.demoqa.pages.forms;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class PracticeFormPage extends Methods {

    By item = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By email = By.id("userEmail");
    By ca = By.id("currentAddress");
    By date = By.id("dateOfBirthInput");
    By phoneNum = By.id("userNumber");
    By fName = By.id("firstName");
    By lName = By.id("lastName");
    By submitButton = By.id("submit");
    By subjects = By.id("subjectsInput");
    By hobbies = By.xpath("//*[contains(@class,\"custom-checkbox\")]");
    By genderOption = By.xpath("//*[contains(@class,\"custom-radio\")]");
    By states = By.id("react-select-3-input");
    By cities = By.id("react-select-4-input");
    By picture = By.id("uploadPicture");
    By responseTitle = By.xpath("//*[text()=\"Thanks for submitting the form\"]");
    By assertionList = By.xpath("//td[2]");
    By close = By.id("closeLargeModal");

    public PracticeFormPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @Step
    public void clickPracticeForm() {
        click(item);
    }

    @Step
    public void enterFirstName(String firstName) {
        sendKeys(fName, firstName);
    }

    @Step
    public void enterLastName(String lastname) {
        sendKeys(lName, lastname);
    }

    @Step
    public void gender(String gender) {
        int i = arrayListToInt(StaticVariables.GENDER, gender);
        clickWithIndex(genderOption, i);
    }

    @Step
    public void enterEmail(String eMail) {
        sendKeys(email, eMail);
    }

    @Step
    public void enterMobileNumber(String mobile) {
        if (mobile.length() == 10) {
            sendKeys(phoneNum, mobile);
        } else {
            System.out.println("The number must contain 10 digits");
        }
    }

    @Step
    public void dateOfBirth(String dob) {
        dateSendKeys(date, dob);
    }

    @Step
    public void enterSubjects(String subject) {
        sendKeysEnter(subjects, subject);
    }

    @Step
    public void chooseHobby(String hobby) {
        int i = arrayListToInt(StaticVariables.HOBBIES, hobby);
        moveToElement(hobbies);
        clickWithIndex(hobbies, i);
    }

    @Step
    public void enterCurrentAddress(String currentAddress) {
        sendKeysEnter(ca, currentAddress);
    }

    @Step
    public void submit() {
        moveToElement(submitButton);
        clickActions(submitButton);
    }

    @Step
    public void uploadPicture(String path) throws IOException, InterruptedException {
        uploadFileWithAutoIt(picture, path);
    }

    @Step
    public void state(String state) {
        sendKeysEnter(states, state);
    }

    @Step
    public void city(String city) {
        sendKeysEnter(cities, city);
    }

    @Step
    public String response() {
        return getText(responseTitle);
    }

    @Step
    public String getText(int i) {
        return getTexts(assertionList, i);
    }

    @Step
    public void clickClose() {
        click(close);
    }
}