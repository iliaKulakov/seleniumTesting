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

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //@FindBy(id = "LoginForm_account")
    @FindBy(xpath = "//*[@id=\"LoginForm_account\"]")
    private WebElement login;

    @FindBy(id = "LoginForm_password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[4]/button")
    private WebElement bSubmitRegister;


    public void registerUser(User user) {
        login.sendKeys(user.login);
        password.sendKeys(user.password);
        bSubmitRegister.click();

    }




}
