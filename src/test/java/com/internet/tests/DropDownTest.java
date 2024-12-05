package com.internet.tests;

import com.internet.pages.DropDownPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectDropDownList();
    }

    @Test
    public void dropDownTest(){
        new DropDownPage(driver).choseOption(2)
                .verifyDropDown("Option 2");
    }

}
