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
@FindBy(linkText = "Frames")
WebElement frames;

    public FramePage navigateToFrames() {
        click(frames);
        return new FramePage(driver);
    }
    @FindBy(css = "[href='/windows']")
    WebElement newWindow;

    public MultipleWindowsPage selectMultipleWindows() {
        click(newWindow);
        return new MultipleWindowsPage(driver);
    }
@FindBy(css = "[href='/dropdown']")
WebElement dropDown;
    public DropDownPage selectDropDownList() {
        click(dropDown);
        return new DropDownPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Horizontal Slider')]")
    WebElement slider;

    public HorizontalSliderPage selectSlider() {
clickWithJS(slider,0,400);
        return new HorizontalSliderPage(driver);
    }
@FindBy(xpath ="//a[contains(text(),'Drag and Drop')]" )
WebElement dragDrop;

    public DragAndDropPage selectDragAndDrop() {
        click(dragDrop);
        return new DragAndDropPage(driver);
    }
@FindBy(xpath = "//a[contains(text(),'Hovers')]")
WebElement hover;

    public HoversPage selectHovers() {
        clickWithJS(hover,0,500);
        return new HoversPage(driver);
    }
}



