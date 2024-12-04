package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public JavaAlertsPage selectAlerts() {
        return new JavaAlertsPage(driver);

    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement alerts;

    public HomePage getJavaAlerts() {
        clickWithJS(alerts, 0, 300);
        return new HomePage(driver);
    }
}



