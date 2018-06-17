package page_objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage  {


    public static By searchLineLocator = By.xpath("//*[@id=\"lst-ib\"]");
    public static By imageButton = By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a");

}
