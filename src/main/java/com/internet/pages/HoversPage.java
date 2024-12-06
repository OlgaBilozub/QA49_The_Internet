package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends HomePage {

    public HoversPage(WebDriver driver) {
        super(driver);

    }
@FindBy(css = ".figure")
    WebElement hover;

    public HoversPage hover() {
        pause(1000);
        moveWithJS(0,200);

        new Actions(driver).moveToElement(hover).perform();
        pause(1000);
        return this;
    }

    public HoversPage verifyHover(String value) {
        Assert.assertEquals(hover.getDomProperty("view profile"),value);
        return this;
    }
}