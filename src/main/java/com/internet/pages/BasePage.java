package com.internet.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public static JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
       this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);

    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void clickWithJS(WebElement element, int x, int y) {
        moveWithJS(x, y);
        click(element);
    }

    public void moveWithJS(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void typeWithJS(WebElement element, String text, int x, int y) {
        moveWithJS(x, y);
        type(element, text);
    }
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isElementDisplayed(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException ex){
            ex.getMessage();
            return false;
        }
    }
}


