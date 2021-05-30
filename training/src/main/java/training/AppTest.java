package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "<set your URL>";

        // GET request to site
        driver.get(url);

        example(driver);

        System.out.println("=== Test Complete ===");
    }

    /**
     * Follow code examples from https://stackabuse.com/web-browser-automation-with-selenium-and-java/
     * @param driver
     */
    private static void example(WebDriver driver) {

        /* Newsletter location using example: 
        <input id="widget-newsletter" type="email" value="" name="email" class="required email input-lg" placeholder="Enter your email...">
        */

        // Locating Elements via className (html attribute class)
        WebElement newsletterEmail = driver.findElement(By.className("required email input-lg"));

        /* e.g. from
        <select name="age">
            <option value="Yet to born">Not Born</option>
            <option value="Under 20">Under 20</option>
            <option value="20 to 29">Under 30</option>
            <option value="30 to 39">Under 40</option>
            <option value="40 to 50">Under 50</option>
            <option value="Over 50">Above 60</option>
            <option value="Ghost">Not Defined</option>
        </select>
        */
        WebElement age = driver.findElement(By.name("age"));

        // Locating Elements via name, example only
        newsletterEmail = driver.findElement(By.name("email"));

        // Locating Elements via id
        newsletterEmail = driver.findElement(By.id("widget-newsletter"));

        /* Locating Elements via xpath, useful when multiple 
        elements have the same attribute but not the same html value
        e.g.  <input name="gender" type="Radio" value="Female">Female<br>
        */
        WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));

        // Locating Elements via cssSelector like h1, input - e.g.   <input name="language_java" type="Checkbox" value="java">Java<br>
        WebElement languageC = driver.findElement(By.cssSelector("input[value=c]"));
        WebElement languageJava = driver.findElement(By.cssSelector("input[value=java]"));

        // Locating Elements via linkText - .e.g <a href="/">Stack Abuse</a>
        WebElement homepageLink = driver.findElement(By.linkText("Stack Abuse");

        // Locating Elements via partialLinkText - e.g. <a href="">random-text-xyz-i-wont-change-random-digit-123</a>
        WebElement iWontChangeLink = driver.findElement(By.partialLinkText("i-wont-change"));

        /* Locating Elements via tagName like <a>, <div>, there may be multiple elements with the same tag
        Useful if used with findElement on another element which narrows the search */
        WebElement tagNameElem = driver.findElement(By.tagName("select"));
     
        /* === Interactions === */

        // Clicking on a link
        homepageLink.click();

        // Inputting text
        newsletterEmail.sendKeys("billy@gmail.com");

        // Selecting radio buttons
        gender.click();

        // Selecting Checkboxes
        languageC.click();
        languageJava.click();

        // Selecting items from dropdown
        Select select = new Select(age);

        // Select by Displayed Text
        select.selectByVisibleText("Under 30");

        // Select by Value (the value atribute)
        select.selectByValue("20 to 30");

        // Index (starts with 0)
        select.selectByIndex(2);

        // To check if the application allows multiple selections we can run:
        select.isMultiple();

        // There are lots of other useful operations that we can perform on the dropdown list:

        // Getting the list of options:

        java.util.List<WebElement> options = select.getOptions();

        // Getting the list of selected options:

        java.util.List<WebElement> options2 = select.getAllSelectedOptions();

        // Getting the first selected option

        WebElement options3 = select.getFirstSelectedOption();

        // Deselect all options

        select.deselectAll();

        // Deselect by displayed text:

        select.deselectByVisibleText("Under 30");

        // Deselect by value:

        select.deselectByValue("20 to 30");

        // Deselect by index:

        select.deselectByIndex(2);

        // Find and click on the Submit button
        driver.findElement(By.id("submit_htmlform")).click();

        // Find element by name=age and select it
        Select select2 = new Select(driver.findElement(By.name("age")));

        // Get the value of a particular attribute in an element
        driver.findElement(By.id("some-id")).getAttribute("class");
        
        // and set it Option 1 using Javascripts
        WebElement elementToChange = driver.findElement(By.id("some-id"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('some-id').setAttribute('class', 'enable')");
        // and set it Option 2
        setAttribute(elementToChange, "enable", true);        
        
    }

    /**
     * Set and attribute of an WebElement
     * @param element to change
     * @param value new value
     * @param clearFirst whether to clear the value first before setting it
     */
    public static void setAttribute(WebElement element, String value, Boolean clearFirst) {
        if (clearFirst) {
            element.clear();
        }
        element.sendKeys(value);
    }
}
