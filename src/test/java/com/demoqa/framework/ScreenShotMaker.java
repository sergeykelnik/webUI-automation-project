package com.demoqa.framework;

import com.demoqa.tests.BaseTests;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotMaker extends TestListenerAdapter {

    private Path path;

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((BaseTests) result.getInstance()).getDriver();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss"));
        Allure.addAttachment(result.getMethod().getMethodName() + timestamp, new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        try {
            FileUtils.copyFile(file, new File(String.format("%s/%s_%s.png", path, result.getName(), timestamp)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ITestContext context) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss"));
        try {
            path = Files.createDirectories(Paths.get("target/screenshots/testRun_" + timestamp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}