package Factory;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;


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


