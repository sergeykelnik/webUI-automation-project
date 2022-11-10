package com.demoqa.framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShotMaker implements ITestListener {

    private Path path;

    @Override
    public void onTestFailure(ITestResult result) {
        File file = ((TakesScreenshot) result.getTestContext().getAttribute("driver")).getScreenshotAs(OutputType.FILE);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss"));
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