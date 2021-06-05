package alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTests;

public class AlertTests extends BaseTests {
    
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alertClickToAccept();
        Assert.assertEquals(alertsPage.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alertGetText();
        alertsPage.alertClickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");   
    }
}
