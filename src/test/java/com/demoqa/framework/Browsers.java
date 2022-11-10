package com.demoqa.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
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
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
            }
            break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("There is no such browser");
                break;
        }
        return driver;
    }

}
