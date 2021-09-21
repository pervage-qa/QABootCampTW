package com.bootcamp.driver;

import com.bootcamp.constants.FrameworkConstants;
import com.bootcamp.utils.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static void initDriver() throws Exception {
        // Creating only one instance across all tests
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            driver.get(CommonUtils.getProperty("url"));
            driver.manage().window().maximize();
        }
    }

    public static void quitDriver()
    {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
