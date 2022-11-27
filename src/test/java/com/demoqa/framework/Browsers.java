package com.demoqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class Browsers {
    private WebDriver driver;
    private ChromeOptions options;

    public WebDriver openWithSwitch(String browser) {
        switch (browser) {
            case "chrome": {
                options = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("profile.default_content_settings.popups", 0);
                prefs.put("download.default_directory", "D:\\Downloads\\DemoQA");
                options.addArguments("--headless");
                options.addArguments("disable-popup-blocking");
                options.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(options);
            }
            break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("There is no such browser");
                break;
        }
        return driver;
    }
}