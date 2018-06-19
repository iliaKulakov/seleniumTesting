package storage;

import org.openqa.selenium.WebDriver;
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

public class DriverFactory {

    public class DriverFactory {

        private static ThreadLocal<WebDriverThread> driverThread;

        @Before
        public static void instantiateDriverObject() {
            driverThread = new ThreadLocal<WebDriverThread>() {
                @Override
                protected WebDriverThread initialValue() {
                    WebDriverThread webDriverThread =
                            new WebDriverThread();
                    return webDriverThread;
                }
            };
        }
        public static WebDriver getDriver() throws Exception {
            return driverThread.get().getDriver();
        }

        @After
        public static void quitDriver() throws Exception {
          //  driverThread.get().quit();
            driverThread.get().getDriver().quit();
        }
    }

}
