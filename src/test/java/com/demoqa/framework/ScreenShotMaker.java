package com.demoqa.framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShotMaker implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        File srcFile = ((TakesScreenshot) result.getTestContext().getAttribute("driver")).getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
        try {
            FileUtils.copyFile(srcFile, new File("target/screenshots/" + result.getName() + "_" + TimeStamp + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}