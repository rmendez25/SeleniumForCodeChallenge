package com.demo.qa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
    public static String getProperty(String property) {
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\rmend\\IdeaProjects\\SeleniumDemo\\src\\test\\java\\com\\demo\\config\\config.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(property);
    }

}
