package com.framework.test;
import com.framework.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.framework.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifySuccessfulLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();

        // Perform assertions here to check successful state change
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("logged-in-successfully"));
    }
}