package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Factory.DriverFactory;

public class GooglePage {

    //public static By searchLineLocator = By.xpath("");
   // public static By imageButton = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a");

    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    private WebElement searchLineLocator;

    public WebElement getSearchLineLocator() {
        return searchLineLocator;
    }

    @FindBy(xpath = "//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")
    private WebElement imageButton;

    public WebElement getImageButton() {
        return imageButton;
    }

    public GooglePage(WebDriver driver) throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

}
