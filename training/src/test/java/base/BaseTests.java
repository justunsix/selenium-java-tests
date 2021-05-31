package base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    
    @Before
    public void setUp() {

        unitTest();

    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    @Test
    public void unitTest() {
        
        driver = new ChromeDriver();

        // Load browser, visit a URL, use a sample app for automation
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        // Make sure to close the session, it will close the Window
        driver.quit();

        assertTrue( true );

    }

    public void beginnerUnitTest() {
        
        /* Changing sizes of window */

        // Example iPhone dimensions
        // driver.manage().window().setSize(new Dimension(375, 812));
        // driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        // Find all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Found " + links.size() + " links.");

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        System.out.println("=== Visited: " + driver.getTitle() + "===");

        String searchText = "Angellic";
        try {
            inputsLink = driver.findElement(By.linkText(searchText));    
        } catch (NoSuchElementException e) {
            System.err.println("No such link " + searchText + " found." );
        }
        

        if (driver.getTitle().equals("The Internet")) {
            assertTrue( true );
        } else {
            assertFalse(
                 true );
        }
    }

}
