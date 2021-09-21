package com.bootcamp.constants;

public class FrameworkConstants {
    public static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver";

    public static String getChromeDriverPath(){
        return CHROMEDRIVERPATH;
    }
}
