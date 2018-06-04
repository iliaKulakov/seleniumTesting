//синглтон
package storage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertNotNull;

public class WebDriverInstance {


        private static WebDriverInstance instance;

        public static synchronized WebDriverInstance getInstance() {
            getInfo().get("http://qa.sedmax.ru/");
            getInfo().findElement(By.id("LoginForm_account")).sendKeys("test");
            getInfo().findElement(By.id("LoginForm_password")).sendKeys("test");
            WebElement enterButton = getInfo().findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button"));
            enterButton.click();

            if (instance == null) {
                instance = new WebDriverInstance();
            }
            return instance;
        }

        public static WebDriver getInfo(){
            System.setProperty("webdriver.chrome.driver", "C:/Users/Angron/Downloads/chromedriver.exe"); // path of chromedriver
            WebDriver driver = new ChromeDriver();
            return driver;
        }


}















