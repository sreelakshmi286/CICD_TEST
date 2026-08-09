package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // 1. Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("submit");

    // 2. Constructor to initialize driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Page Actions/Methods
    public void enterUsername(String user) {
        driver.findElement(usernameField).sendKeys(user);
    }

    public void enterPassword(String pwd) {
        driver.findElement(passwordField).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}