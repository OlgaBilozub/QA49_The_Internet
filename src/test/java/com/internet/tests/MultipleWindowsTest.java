package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectMultipleWindows();
    }

    @Test
    public void testMultipleWindows() {
        new MultipleWindowsPage(driver)
                .swithMultipleWindows(1)
                .verifyNewWindowText("New Window");
    }
}