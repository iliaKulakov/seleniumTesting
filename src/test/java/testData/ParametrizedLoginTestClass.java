package testData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static testData.User.createValidUser;

@RunWith(Parameterized.class)
public class ParametrizedLoginTestClass {

    public static WebDriver driver;
    private User user;
    private String errorMessage;

    @Parameters
    public static Collection<Object[]> data() {
        User user1 = User.createValidUser();
        user1.passwordConfirmation = "111";

        User user2 = User.createValidUser();
        user2.login = "";

        Object[][] data = new Object[][] {
                { user1, "Пользователь с введенными параметрами не найден!" },
                { user2, "Пользователь с введенными параметрами не найден!"}
        };
        return Arrays.asList(data);
    }

    public ParametrizedLoginTestClass(User user , String errorMessage) {
        this.user = user;
        this.errorMessage = errorMessage;
    }

    @Test
    public void registerUserErrorsTest() {
        user= createValidUser();
        driver.get("http://qa.sedmax.ru/");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.registerUser(user);
        registrationPage.checkErrorMessage(errorMessage);
    }

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Angron/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
