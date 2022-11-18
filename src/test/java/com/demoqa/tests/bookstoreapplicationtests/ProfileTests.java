package com.demoqa.tests.bookstoreapplicationtests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTests {

    @BeforeGroups("profile")
    public void preconditionSteps() {
        setup();
        login();
        profilePage.chooseActionToClick("Delete All Books");
        modalDialogsPage.setOKSmallModal();
        tear_down();
    }

    private void login() {
        homePage.chooseHomePageMenu("Book Store");
        bookStorePage.chooseBookStoreMenu("Profile");
        profilePage.chooseLoginOrRegistration("login");
        loginPage.enterUsername("Nate25");
        loginPage.enterPassword("12345Aa!");
        bookStorePage.clickLoginButton();
    }

    @Test(groups = "profile")
    public void profilePageTests() {
        login();
        profilePage.clickGoToBookStoreButton();
        bookStorePage.openBookByTitle("Git Pocket Guide");
        profilePage.addBook();
        bookStorePage.clickBackToBookstore();
        bookStorePage.openBookByTitle("Learning JavaScript Design Patterns");
        profilePage.addBook();
        bookStorePage.chooseBookStoreMenu("Profile");
        profilePage.writeBookToSearch("Learning JavaScript Design Patterns");
        profilePage.deleteChosenBook(0);
        modalDialogsPage.setOKSmallModal();
    }
}
