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
import storage.WebDriverInstance;

import static org.junit.Assert.assertNotNull;

public class SeleniumTest extends WebDriverInstance{
    void checkElements(WebElement driver) throws Exception {
    }

    public static void main(String[] args) throws Exception {

        WebDriver driverInstance = WebDriverInstance.getInfo();


        // TODO Auto-generated method stub
       /* System.setProperty("webdriver.chrome.driver", "C:/Users/Angron/Downloads/chromedriver.exe"); // path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.sedmax.ru/");
        driver.findElement(By.id("LoginForm_account")).sendKeys("test");
        driver.findElement(By.id("LoginForm_password")).sendKeys("test");
        WebElement enterButton= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button"));
        enterButton.click();*/
         WebDriverInstance singleton = WebDriverInstance.getInstance();
         WebElement enterButton1 = driverInstance.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
         enterButton1.click();
         WebElement enterButton2 = driverInstance.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul"));
         enterButton2.click();
       /* //Проверка элементов на странице отчетов
        boolean present;
        try {
            //"добавить отчет"
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/a/button"));
            //удалить выбранное
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/button"));
            //чек-бокс существует
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/label"));
            //проверка что ссылка на 1 отчет существует
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/a"));
            //проверка кнопки "Редактировать" и копировать
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[6]/div/a/button"));
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[6]/div/button"));
            present = true;
            System.out.println("Элементы существуют");

        } catch (NoSuchElementException e) {
            present = false;
        }

*/


    }



}

