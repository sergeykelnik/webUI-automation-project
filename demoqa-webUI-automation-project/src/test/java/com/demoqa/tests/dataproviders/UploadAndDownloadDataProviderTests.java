package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UploadAndDownloadDataProviderTests extends BaseTests {
    @DataProvider(name="Upload files")
    public static Object [][] dataProvider(){
        return new Object[][]{
                {"C:\\Users\\Natasha.Kostovska\\IdeaProjects\\demoqa-webUI-automation-project\\src\\test\\resources\\filesforupload\\Nate.docx"},
                {"C:\\Users\\Natasha.Kostovska\\Documents\\Nate.pdf"},
                {"C:\\Users\\Natasha.Kostovska\\Downloads\\Response_codes_TestingREST7.png"},
                {"C:\\Users\\Natasha.Kostovska\\Downloads\\minion.jpg"},
                {"C:\\Users\\Natasha.Kostovska\\Downloads\\Postman-win64-8.8.0-Setup.exe"}

        };
    }
    @Test(dataProvider = "Upload files")
    public void uploadFilesTest(String fileToUpload)  {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Upload and Download");
        Assert.assertEquals(methods.getTitleName(),"Upload and Download");
        uploadAndDownloadPage.clickChooseFile(fileToUpload);
        waitTime();
    }
}
