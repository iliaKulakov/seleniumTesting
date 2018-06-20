package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.GoogleImagePage;
import page_objects.GooglePage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//@RunWith(Parameterized.class)
public class GoogleSearchTest {

    public static WebDriver driver;
    private String errorMessage;

    @Before
    public void setUp() {
        InputStream fis;
        Properties properties = new Properties();
        try {
            fis = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.path"));
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void goToGooglePage() {
        driver.get("http://google.com");
        GooglePage googlePage = new GooglePage();
        try {
            WebElement searchLine = driver.findElement(googlePage.searchLineLocator);
        } catch (NoSuchElementException e) {
        }
    }

    @Test
    public void checkImageButton() {
        driver.get("http://google.com");
        GooglePage googlePage = new GooglePage();
        WebElement googleImage = driver.findElement(googlePage.imageButton);
        googleImage.click();
        try {
            GoogleImagePage googleImagePage = new GoogleImagePage();
            WebElement imageSearchButton = driver.findElement(googleImagePage.imageSearchButton);
            imageSearchButton.click();
            WebElement loadImageButton = driver.findElement(googleImagePage.loadImageButton);
            loadImageButton.click();
            WebElement closeSearchWindowButton = driver.findElement(googleImagePage.closeSearchWindowButton);
            closeSearchWindowButton.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

    }
}




