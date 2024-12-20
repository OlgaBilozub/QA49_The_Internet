package com.internet.tests;

import com.internet.pages.DragAndDropPage;
import com.internet.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectDragAndDrop();
    }
    @Test
    public void dragAndDropTest(){
        new DragAndDropPage(driver).actionA()
                .verifyDragA("B");

    }
}
