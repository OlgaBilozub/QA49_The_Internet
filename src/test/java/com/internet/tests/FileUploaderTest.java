package com.internet.tests;

import com.internet.pages.FileUploaderPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploaderTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectFileUploader();
    }
    @Test
    public void fileUploaderTest(){
        new FileUploaderPage(driver).uploadFile("C:\\Users\\alona\\OneDrive\\Документы\\Snapchat-2095367846.jpg")
                .clickUpload()
                .verifyUpload();
    }
}
