package pages;

import org.openqa.selenium.*;

/**
 * Framework page to build a Page Object Model design pattern
 */
public class HomePage {

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private WebDriver driver;
    
    /**
     * Constructor
     * @param driver Selenium WebDriver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Follows form auth link
     */
    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
