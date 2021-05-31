package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {

        // Optional. If not specified, WebDriver searches the PATH for chromedriver
        // System.setProperty("webdriver.chrome.driver",
        // "C:\\Users\\justi\\Downloads\\chrome\\chromedriver_win32-91");

        // Optional. Sets a non-standard location for Chrome, not required if Chrome is installed in
        // a standard location
        // ChromeOptions options = new ChromeOptions();
        // options.setBinary("C:\\Users\\justi\\Downloads\\chrome\\GoogleChromePortable\\App\\Chrome-bin");

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

        // Changing sizes of window

        // Example iPhone dimensions
        driver.manage().window().setSize(new Dimension(375, 812));
        // driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        System.out.println("=== Visited: " + driver.getTitle() + "===");

        if (driver.getTitle().equals("The Internet")) {
            assertTrue( true );
        } else {
            assertFalse( true );
        }
        // Make sure to close the session, it will close the Window
        driver.quit();

    }


}
