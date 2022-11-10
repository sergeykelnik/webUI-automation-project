package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UploadAndDownloadDataProviderTests extends BaseTests {

    @DataProvider(name = "Upload files")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"src/test/resources/filesforupload/Nate.docx"},
                {"src/test/resources/filesforupload/Nate.pdf"},
                {"src/test/resources/filesforupload/Response_codes_TestingREST7.png"},
                {"src/test/resources/filesforupload/minion.jpg"},
                {"src/test/resources/filesforupload/Postman-win64-8.8.0-Setup.exe"}
        };
    }

    @Test(dataProvider = "Upload files")
    public void uploadFilesTest(String fileToUpload) {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Upload and Download");
        Assert.assertEquals(methods.getTitleName(), "Upload and Download");
        uploadAndDownloadPage.clickChooseFile(fileToUpload);
    }
}