package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectHovers();
    }
    @Test
    public void hoversTest(){
        new HoversPage(driver).hover()
               .verifyHover("2");
    }
}


