package com.demoqa.tests.formstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PracticeFormTests extends BaseTests {

    @Test
    public void practiseFormTest() throws IOException, InterruptedException {
        String fakerName = ukFaker.name().firstName();
        String fakerLastName = ukFaker.name().lastName();
        String fakerEmail = ukFaker.name().username().toLowerCase(Locale.ROOT);
        String fakerMobile = ukFaker.numerify("1141234569");
        String fakerDate = new SimpleDateFormat("dd MMMM,yyyy").format(faker.date().birthday());
        String fakerAddress = ukFaker.address().streetAddress();

        homePage.chooseHomePageMenu("Forms");
        practiceFormPage.clickPracticeForm();
        practiceFormPage.enterFirstName(fakerName);
        practiceFormPage.enterLastName(fakerLastName);
        practiceFormPage.enterEmail(fakerEmail + "@test.com");
        practiceFormPage.gender("Female");
        practiceFormPage.enterMobileNumber(fakerMobile);
        practiceFormPage.enterSubjects("Maths");
        practiceFormPage.enterSubjects("English");
        practiceFormPage.enterSubjects("Computer Science");
        practiceFormPage.enterSubjects("Physics");
        practiceFormPage.chooseHobby("Sports");
        practiceFormPage.chooseHobby("Reading");
        practiceFormPage.chooseHobby("Music");
        practiceFormPage.uploadPicture("src/test/resources/autoitfiles/FileUpload.exe");
        practiceFormPage.enterCurrentAddress(fakerAddress);
        practiceFormPage.state("NCR");
        practiceFormPage.city("Delhi");
        practiceFormPage.dateOfBirth(fakerDate);
        practiceFormPage.submit();

        SoftAssert softly = new SoftAssert();
        softly.assertEquals(practiceFormPage.response(), "Thanks for submitting the form");
        softly.assertEquals(practiceFormPage.getText(0), fakerName + " " + fakerLastName);
        softly.assertEquals(practiceFormPage.getText(1), fakerEmail + "@test.com");
        softly.assertEquals(practiceFormPage.getText(2), "Female");
        softly.assertEquals(practiceFormPage.getText(3), fakerMobile);
        softly.assertEquals(practiceFormPage.getText(4), fakerDate);
        softly.assertEquals(practiceFormPage.getText(5), "Maths, English, Computer Science, Physics");
        softly.assertEquals(practiceFormPage.getText(6), "Sports, Reading, Music");
        softly.assertEquals(practiceFormPage.getText(7), "Response_codes_TestingREST7.png");
        softly.assertEquals(practiceFormPage.getText(8), fakerAddress);
        softly.assertEquals(practiceFormPage.getText(9), "NCR Delhi");
        softly.assertAll();
        practiceFormPage.clickClose();
    }
}
