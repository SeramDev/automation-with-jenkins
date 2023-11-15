package com.training.template.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private WebElement txtUserName = driver.findElement(By.id("userName"));
    private WebElement txtPassword = driver.findElement(By.id("password"));
    private WebElement btnLogin = driver.findElement(By.id("login"));

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public WelcomePage clickLogin(){
        btnLogin.click();
        return new WelcomePage(driver);
    }

}
