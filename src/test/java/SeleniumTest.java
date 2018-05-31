//да пока тут просто эксперименты с запуском браузера


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

//Храню веб-драйвер отдельно, чтобы не тащить его в гит
public class SeleniumTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angron\\Downloads\\chromedriver.exe"); // path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.sedmax.ru/");
        driver.findElement(By.id("LoginForm_account")).sendKeys("test");
        driver.findElement(By.id("LoginForm_password")).sendKeys("test");
        //не получается подобрать локатор, чтобы нажимать кнопку войти
        WebElement element= driver.findElement(By.ByXPath("//input[@value='Войти'][@title='Войти']")).click();


    }
}
