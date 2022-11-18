package com.demoqa.tests;

import com.demoqa.framework.Browsers;
import com.demoqa.framework.ScreenShotMaker;
import com.demoqa.methods.Methods;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.alertframeandwindows.*;
import com.demoqa.pages.bookstoreapplication.BookStorePage;
import com.demoqa.pages.bookstoreapplication.LoginPage;
import com.demoqa.pages.bookstoreapplication.ProfilePage;
import com.demoqa.pages.elements.*;
import com.demoqa.pages.forms.PracticeFormPage;
import com.demoqa.pages.interactions.*;
import com.demoqa.pages.widgets.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;
import java.util.Locale;

@Listeners(ScreenShotMaker.class)
public class BaseTests {

    public static final String URL = "https://demoqa.com/";
    public HomePage homePage;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public CheckBoxPage checkBoxPage;
    public LinksPage linksPage;
    public BrowserWindowPage browserWindowPage;
    public BookStorePage bookStorePage;
    public BrokenLinks brokenLinks;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public PracticeFormPage practiceFormPage;
    public TextBoxPage textBoxPage;
    public WebTablesPage webTablesPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public NestedFramesPage nestedFramesPage;
    public ModalDialogsPage modalDialogsPage;
    public SortablePage sortablePage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public SliderPage sliderPage;
    public ProgressBarPage progressBarPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipsPage;
    public MenuPage menuPage;
    public SelectMenuPage selectMenuPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public SelectablePage selectablePage;
    public ResizablePage resizablePage;
    public DroppablePage droppablePage;
    public DraggablePage draggablePage;
    public Methods methods;
    public Faker ukFaker;
    public Faker faker;
    Browsers browsers = new Browsers();
    Actions actions;
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = browsers.openWithSwitch("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().setSize(new Dimension(2560, 1440));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        ukFaker = new Faker(new Locale("en-GB"));
        faker = new Faker();

        homePage = new HomePage(driver, wait, actions);
        buttonsPage = new ButtonsPage(driver, wait, actions);
        radioButtonPage = new RadioButtonPage(driver, wait, actions);
        checkBoxPage = new CheckBoxPage(driver, wait, actions);
        linksPage = new LinksPage(driver, wait, actions);
        browserWindowPage = new BrowserWindowPage(driver, wait, actions);
        bookStorePage = new BookStorePage(driver, wait, actions);
        brokenLinks = new BrokenLinks(driver, wait, actions);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wait, actions);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait, actions);
        practiceFormPage = new PracticeFormPage(driver, wait, actions);
        textBoxPage = new TextBoxPage(driver, wait, actions);
        webTablesPage = new WebTablesPage(driver, wait, actions);
        alertsPage = new AlertsPage(driver, wait, actions);
        framesPage = new FramesPage(driver, wait, actions);
        nestedFramesPage = new NestedFramesPage(driver, wait, actions);
        modalDialogsPage = new ModalDialogsPage(driver, wait, actions);
        sortablePage = new SortablePage(driver, wait, actions);
        accordianPage = new AccordianPage(driver, wait, actions);
        autoCompletePage = new AutoCompletePage(driver, wait, actions);
        datePickerPage = new DatePickerPage(driver, wait, actions);
        sliderPage = new SliderPage(driver, wait, actions);
        progressBarPage = new ProgressBarPage(driver, wait, actions);
        tabsPage = new TabsPage(driver, wait, actions);
        toolTipsPage = new ToolTipsPage(driver, wait, actions);
        menuPage = new MenuPage(driver, wait, actions);
        selectMenuPage = new SelectMenuPage(driver, wait, actions);
        loginPage = new LoginPage(driver, wait, actions);
        profilePage = new ProfilePage(driver, wait, actions);
        selectablePage = new SelectablePage(driver, wait, actions);
        resizablePage = new ResizablePage(driver, wait, actions);
        droppablePage = new DroppablePage(driver, wait, actions);
        draggablePage = new DraggablePage(driver, wait, actions);
        methods = new Methods(driver, wait, actions);
        driver.get(URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void tear_down() {
        if (driver != null) {
            driver.quit();
        }
    }
}