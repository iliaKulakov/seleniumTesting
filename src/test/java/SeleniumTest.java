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

public class SeleniumTest {

    void checkElements(WebElement driver) throws Exception {



    }




    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/Angron/Downloads/chromedriver.exe"); // path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.sedmax.ru/");
        driver.findElement(By.id("LoginForm_account")).sendKeys("test");
        driver.findElement(By.id("LoginForm_password")).sendKeys("test");
        WebElement enterButton= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button"));
        enterButton.click();
         WebElement enterButton1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
         enterButton1.click();
         WebElement enterButton2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul"));
         enterButton2.click();
        //Проверка элементов на странице отчетов
        boolean present;
        try {

            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/a/button"));
            present = true;
            System.out.println("Элемент существует");
        } catch (NoSuchElementException e) {
            present = false;
        }




    }



}

