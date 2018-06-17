//синглтон
package storage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstance {

    private static WebDriver instance;

    public static synchronized WebDriver getInstance() {
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_PATH"));
        instance = new ChromeDriver();

        instance.get("http://qa.sedmax.ru/");
        instance.findElement(By.id("LoginForm_account")).sendKeys("test");
        instance.findElement(By.id("LoginForm_password")).sendKeys("test");
        WebElement enterButton = instance.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button"));
        enterButton.click();

        if (instance == null) {
            instance = new ChromeDriver();
        }
        return instance;
    }

}















