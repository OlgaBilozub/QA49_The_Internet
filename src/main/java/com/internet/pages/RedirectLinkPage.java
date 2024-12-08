package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

public class RedirectLinkPage extends HomePage {

    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#redirect")
    WebElement clickHere;

    public RedirectLinkPage clickHere() {
        clickWithJS(clickHere, 0, 300);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'here')]")
    WebElement hereHTTP;

    public RedirectLinkPage clickHereHTTP() {
        clickWithJS(hereHTTP, 0, 300);
        return this;
    }

    @FindBy(css = "a")
    List<WebElement> allLinks;

    public RedirectLinkPage checkAllLinks() {
        String url = "";
        System.out.println("Total links on the page: " + allLinks.size());
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
            System.out.println("*******************************************");
        }
        return this;
    }
}