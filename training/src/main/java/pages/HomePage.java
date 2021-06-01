package pages;

import org.openqa.selenium.*;

/**
 * Framework page to build a Page Object Model design pattern 
 * like getting elements, clicking buttons, etc. This frees up the 
 * test classes to focus on testing rather than page object models.
 * 
 * In other words, Selenium work is primarily in the framework classes
 * and not the test cases.
 */
public class HomePage {

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
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

    /**
     * Follows dropdown page
     */
    public DropdownPage clickDropdown() {
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }
}
