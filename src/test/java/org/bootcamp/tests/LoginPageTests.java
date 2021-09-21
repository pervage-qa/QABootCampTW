package org.bootcamp.tests;

import com.bootcamp.driver.Driver;
import com.bootcamp.pages.CustomerPage;
import com.bootcamp.pages.LoginPage;
import com.bootcamp.utils.CommonUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {


    @Test(enabled = false)
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
        Driver.driver.findElement(By.xpath("//button//span[text()=\"Dismiss\"]")).click();
        Driver.driver.findElement(By.id("navbarAccount")).click();
        Driver.driver.findElement(By.id("navbarLoginButton")).click();
        Thread.sleep(1000);

    }
    @Test
    public void registerAndLoginWithValidCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        CustomerPage customerPage = new CustomerPage();

        Thread.sleep(1000);
        String password_add = "Hello";
        String email_add = CommonUtils.userName();
        //Navigating to Login Page
        loginPage.clickWelcomeBanner();
        loginPage.goToLogin();

        //Creating New Customer
        customerPage.createCustomer(email_add, password_add,"Testing");

        Thread.sleep(1000);
        //Login with Registered Email and Password
        loginPage.userLogin(email_add,password_add);
    }
}
