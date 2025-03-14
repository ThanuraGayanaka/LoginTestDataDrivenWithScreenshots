package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Error loading config file: " + e.getMessage());
            throw new RuntimeException("Failed to load config file", e);
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("Key not found in config file: " + key);
        }
        return value;
    }
}
