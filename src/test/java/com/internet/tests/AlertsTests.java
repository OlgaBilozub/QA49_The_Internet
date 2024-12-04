package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.JavaAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaAlerts();
        new JavaAlertsPage(driver).selectAlerts();
    }
    @Test
    public void alertJsTest(){
        new JavaAlertsPage(driver).alertJs();


    }
    @Test
    public void alertWithConfirmTest(){
        new JavaAlertsPage(driver)
                .selectResult("Cancel")
                .verifyResult("Cancel");
    }
    @Test
    public void alertWithPromptTest(){
        new JavaAlertsPage(driver).sendMessageToAlert("I am Prompt").verifyMessage("I am Prompt");

    }

}
