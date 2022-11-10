# WebUI-automation-project [![Build Status](https://dev.azure.com/sergeykelnik/Selenium/_apis/build/status/sergeykelnik.webUI-automation-project?branchName=master)](https://dev.azure.com/sergeykelnik/Selenium/_build/latest?definitionId=4&branchName=master)

## Automation testing on demoqa.com page (Page Object Model)

## Technologies/Tools used:

1. Java
2. Maven
3. TestNG
4. Selenium WebDriver
5. IntelliJ
6. Java Faker
7. AutoIT

##
In order the tests to start, you will have to download drivers accordingly to the versions of your web browers in the resources->drivers directory.

At the top right, look at More.
Click Help > About Chrome/ About Firefox/ About Microsoft Edge.

## Links for download:

1. Chrome: https://chromedriver.chromium.org/downloads
2. Firefox: (for firefox is gecko driver) https://github.com/mozilla/geckodriver/releases
3. MSEdge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

## 
Or as a second option, in order to save time you can add the WebDriverManager Dependency in the pom.xml file: https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager

In the framework-> Browser.java class of the project erase System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/the specified driver"); and replace accordingly: 

1. WebDriverManager.chromedriver().setup();
2. WebDriverManager.firefoxdriver().setup();
3. WebDriverManager.edgedriver().setup();

