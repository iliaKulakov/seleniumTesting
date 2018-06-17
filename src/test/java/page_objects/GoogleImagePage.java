package page_objects;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class GoogleImagePage {

        public static By searchImageLine = By.xpath("//*[@id=\"lst-ib\"]");
        public static By imageSearchButton = By.xpath("//*[@id=\"qbi\"]");
        public static By screenKeyboardButton = By.xpath("//*[@id=\"gs_ok0\"]");
        public static By voiceSearch = By.xpath("//*[@id=\"gs_st0\"]/a[3]");
        public static By searchButton = By.xpath("//*[@id=\"mKlEF\"]");
        public static By loadImageButton = By.xpath("//*[@id=\"qbug\"]/div/a");
        public static By chooseTheFileButton = By.xpath("//*[@id=\"qbfile\"]");
        public static By closeSearchWindowButton = By.xpath("//*[@id=\"qbx\"]");

}
