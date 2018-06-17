package testData;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Properties;

import static testData.User.createValidUser;

@RunWith(Parameterized.class)
public class ParametrizedLoginTestClass {

    public static WebDriver driver;
    private User user;
    private String errorMessage;

    public ParametrizedLoginTestClass(User user, String errorMessage) {
        this.user = user;
        this.errorMessage = errorMessage;
    }

    @Parameters
    public static Collection<Object[]> data() {
        User user1 = User.createValidUser();
        user1.passwordConfirmation = "111";

        User user2 = User.createValidUser();
        user2.login = "";

        Object[][] data = new Object[][]{
                {user1, "Пользователь с введенными параметрами не найден!"},
                {user2, "Пользователь с введенными параметрами не найден!"}
        };
        return Arrays.asList(data);
    }

    @Test
    public void registerUserErrorsTest() {
        user = createValidUser();
        driver.get("http:google.com");
       // RegistrationPage registrationPage = new RegistrationPage(driver);
       // registrationPage.registerUser(user);
       // registrationPage.checkErrorMessage(errorMessage);
    }

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_PATH"));
        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream("src/test/resources/application.properties");
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

}
