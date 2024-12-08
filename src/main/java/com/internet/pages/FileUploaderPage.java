package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploaderPage extends HomePage{

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "file-upload")
    WebElement uploadPicture;
    public FileUploaderPage uploadFile(String path) {
        uploadPicture.sendKeys(path);
        return this;
    }
@FindBy(css = "#file-submit")
WebElement submit;

    public FileUploaderPage clickUpload() {
        click(submit);
        return this;
    }
@FindBy(xpath = "//h3[contains(text(),'File Uploaded!')]")
WebElement text;

    public FileUploaderPage verifyUpload() {
        Assert.assertTrue(text.isDisplayed(),"File Uploaded!");
        return this;
    }
}

