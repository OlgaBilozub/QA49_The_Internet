package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends HomePage{

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }
@FindBy(tagName = "input")
    WebElement input;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        new Actions(driver).dragAndDropBy(input,225,0).perform();
        return this;
    }

    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(input.getDomAttribute("value"),number);
        return this;
    }
}
