package com.automation.utils;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver() {

        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        // Open the browser
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get(PropertyReader.getProperty("app.url"));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
