package com.internet.tests;

import com.internet.pages.BrokenImagesPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectBrokenImages();
    }
    @Test
    public void checkBrokenImagesTest(){
        String imageURL = "broken images";
        new BrokenImagesPage(driver).checkBrokenImages()
                .verifyImage(imageURL);
    }
}
