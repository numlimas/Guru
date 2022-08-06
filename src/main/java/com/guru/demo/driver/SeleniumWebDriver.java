package com.guru.demo.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static void firefoxDriver(String url) {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--ignore-certificate-errors");
        driver = new FirefoxDriver(options);
        driver.get(url);
    }
}
