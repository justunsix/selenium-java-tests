package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By results = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    /**
     * Click JavaScript based alert that is not in the page's DOM.
     * Switch to alert context
     */
    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    /**
     * Clicks cancel in a JavaScript alert
     */
    public void alertClickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

}
