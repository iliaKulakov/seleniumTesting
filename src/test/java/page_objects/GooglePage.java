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

/*

     boolean existsElement(String id) {
        try {
            getSearchLine().f
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
*/
}
