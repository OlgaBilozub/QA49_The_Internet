package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement frames;

    public FramePage navigateToIframePage() {
        click(frames);
       // new WebDriverWait(driver, Duration.ofSeconds(10))
      //          .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        return this;
    }
@FindBy(id = "mce_0_ifr")
WebElement iframe;

    public FramePage switchToIframe() {
        driver.switchTo().frame(iframe);
        return this;
    }
@FindBy(id = "tinymce")
WebElement iframeBody;

    public FramePage verifyIframeByText(String text) {
        Assert.assertTrue(iframeBody.getText().contains(text));

        return this;
    }

    public FramePage switchToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }
}

