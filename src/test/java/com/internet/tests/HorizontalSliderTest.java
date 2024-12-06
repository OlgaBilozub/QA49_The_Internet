package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectSlider();

    }
    @Test
    public void sliderTest(){
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .verifySliderValue("0");
    }
}


