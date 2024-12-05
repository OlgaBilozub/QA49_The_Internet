package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends HomePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropDownPage choseOption(int number) {
        new Select(dropdown).selectByIndex(number);
        return this;
    }
    public DropDownPage verifyDropDown(String text) {
        Assert.assertTrue((new Select(dropdown)
                .getFirstSelectedOption()
                .getText())
                .equals(text));
        return this;
    }
}