package com.bootcamp.utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;

public class CommonUtils {
    private CommonUtils()
    {}

    public static String getProperty(String key) throws Exception {
        String value = "";
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
        property.load(file);
        value=property.getProperty(key);
        if (Objects.isNull(value)){
            throw new Exception("Property name key"+key+"not found in config.properties");
        }
        return value;
    }

    public static String userName(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String email_add = "username" + randomInt + "@gmail.com";
        return email_add;
    }
}
