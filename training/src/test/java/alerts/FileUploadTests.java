package alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTests;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("G:/u/My Documents Non-Essentials/Code/selenium-java-tests/LICENSE");

        Assert.assertEquals(fileUploadPage.getUploadedFiles(), "LICENSE", "Uploaded file not correct");
    }

}
