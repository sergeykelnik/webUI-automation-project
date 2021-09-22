package com.demoqa.tests.bookstoreapplicationtests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void loginPageTest(){ //how to verify Captcha
        homePage.chooseHomePageMenu("Book Store");
        bookStorePage.chooseBookStoreMenu("Login");
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome,\nLogin in Book Store");
        loginPage.clickNewUserForRegistration();
        Assert.assertEquals(loginPage.getRegisterText(),"Register to Book Store");
        loginPage.enterFirstName("Natasha");
        loginPage.enterLastName("Kostovska");
        loginPage.enterUsername("Nate25");
        loginPage.enterPassword("1234!234?Fa");
        loginPage.hookForCaptcha();
        methods.switchToMainWindow();
        waitTime();
        loginPage.clickRegisterButton();
        waitTime();
        loginPage.clickBackToLogin();
        loginPage.enterUsername("Nate25");
        loginPage.enterPassword("1234!234?Fa");
        //bookStorePage.clickLoginButton();

    }
}
