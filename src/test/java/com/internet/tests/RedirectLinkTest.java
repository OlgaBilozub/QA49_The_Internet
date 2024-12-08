package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.RedirectLinkPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectLinkTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectRedirectLink();
    }
    @Test
    public void redirectLinkTest(){
        new RedirectLinkPage(driver).clickHere()
                .clickHereHTTP()
                .checkAllLinks();
    }
}