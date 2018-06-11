package testData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testData.User;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[3]/div/div")
    private WebElement registerError;

    @FindBy(xpath = "//*[@id=\"LoginForm_account\"]")
    private WebElement login;

    @FindBy(id = "LoginForm_password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[4]/button")
    private WebElement bSubmitRegister;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void registerUser(User user) {
        login.sendKeys(user.login);
        password.sendKeys(user.password);
        bSubmitRegister.click();
    }

    public void checkErrorMessage(String errorMessage) {
        Assert.assertTrue("Error message should be present",
                registerError.isDisplayed());
        Assert.assertTrue("Error message should contains " + errorMessage,
                registerError.getText().contains(errorMessage));
    }
}
