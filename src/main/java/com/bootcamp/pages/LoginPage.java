package com.bootcamp.pages;

import com.bootcamp.driver.Driver;
import org.openqa.selenium.By;

public class LoginPage {
    By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
    By myAccount = By.id("navbarAccount");
    By login = By.id("navbarLoginButton");
    By email = By.id("email");
    By password = By.id("password");
    By loginButton = By.id("loginButton");
    By error = By.className("error");

    public void clickWelcomeBanner(){
        Driver.driver.findElement(welcomeBanner).click();
    }

    public void clickMyAccount(){
        Driver.driver.findElement(myAccount).click();
    }

    public void clickLogin(){
        Driver.driver.findElement(login).click();
    }

    public void setEmail(String Email){
        Driver.driver.findElement(email).sendKeys(Email);
    }
    public void setPassword(String Password){
        Driver.driver.findElement(password).sendKeys(Password);
    }

    public void clickLoginButton(){
        Driver.driver.findElement(loginButton).click();
    }

    public void goToLogin(){
        clickMyAccount();
        clickLogin();
    }
    public void userLogin(String Email, String Password){
        setEmail(Email);
        setPassword(Password);
        clickLoginButton();
    }

}
