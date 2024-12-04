package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaAlertsPage extends BasePage {

    public JavaAlertsPage(WebDriver driver) {
        super(driver);
    }

    public JavaAlertsPage alertTest() {
        return new JavaAlertsPage(driver);
    }

    @FindBy(css = "body:nth-child(2) > div.row:nth-child(2)")
    WebElement javaScriptAlerts;

    public JavaAlertsPage selectAlerts() {
        clickWithJS(javaScriptAlerts, 0, 300);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement alertButton;

    public JavaAlertsPage alertJs() {
        click(alertButton);
        return this;

    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement confirmButton;

    public JavaAlertsPage selectResult(String result) {
        click(confirmButton);
        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public JavaAlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }
@FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
WebElement promptButton;

    public JavaAlertsPage sendMessageToAlert(String message) {
        click(promptButton);

        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
@FindBy(id = "result")
WebElement promptResult;

    public JavaAlertsPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }
}
