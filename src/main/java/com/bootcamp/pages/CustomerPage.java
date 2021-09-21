package com.bootcamp.pages;

import com.bootcamp.driver.Driver;
import org.openqa.selenium.By;

public class CustomerPage {
    By newCustomerLink = By.id("newCustomerLink");
    By email = By.id("emailControl");
    By password = By.id("passwordControl");
    By repeatPassword = By.id("repeatPasswordControl");
    By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    By openDropDown = By.className("mat-select-arrow");
    By securityAnswer = By.id("securityAnswerControl");
    By registerButton = By.id("registerButton");

    public void clickNewCustomerLink(){
        Driver.driver.findElement(newCustomerLink).click();
    }
    public void setEmail(String Email){
        Driver.driver.findElement(email).sendKeys(Email);
    }
    public void setPassword(String Password){
        Driver.driver.findElement(password).sendKeys(Password);
    }
    public void setRepeatPassword(String RepeatPassword){
        Driver.driver.findElement(repeatPassword).sendKeys(RepeatPassword);
    }
    public void setSelectOption(){
        Driver.driver.findElement(openDropDown).click();
        Driver.driver.findElement(selectOption).click();
    }
    public void setSecurityAnswer(String Answer){
        Driver.driver.findElement(securityAnswer).sendKeys(Answer);
    }
    public void clickRegisterButton(){
        Driver.driver.findElement(registerButton).click();
    }
    public void createCustomer(String Email,String Password, String Answer){
        clickNewCustomerLink();
        setEmail(Email);
        setPassword(Password);
        setRepeatPassword(Password);
        setSelectOption();
        setSecurityAnswer(Answer);
        clickRegisterButton();
    }
}
