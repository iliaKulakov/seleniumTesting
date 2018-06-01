import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertNotNull;

public class SeleniumTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "/home/rmuhamedgaliev/Downloads/chromedriver"); // path of chromedriver
       System.setProperty("webdriver.chrome.driver", "C:/Users/Angron/Downloads/chromedriver.exe"); // path of chromedriver

        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.sedmax.ru/");
        driver.findElement(By.id("LoginForm_account")).sendKeys("test");
        driver.findElement(By.id("LoginForm_password")).sendKeys("test");

        WebElement enterButton= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button"));
        enterButton.click();
        //WebElement enterButton1 = driver.findElement(By.className("sub-menu"));
        //enterButton1.click();
    }
}
