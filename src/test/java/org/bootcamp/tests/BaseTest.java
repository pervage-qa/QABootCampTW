package org.bootcamp.tests;

import com.bootcamp.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown(){
       Driver.quitDriver();
    }
}
