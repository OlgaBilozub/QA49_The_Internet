package com.internet.tests;

import com.internet.pages.FramePage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).navigateToFrames();

    }
    @Test
    public void iframeTest(){
        new FramePage(driver)
                .navigateToIframePage()
                .switchToIframe()
                .verifyIframeByText("Your content goes here.")
                .switchToDefaultContent();
    }
    }

