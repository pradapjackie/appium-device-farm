package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Example {

    private AndroidDriver driver;
    private MutableCapabilities capabilities;

    @Test
    public void androidVivoDevice() throws MalformedURLException, InterruptedException {

        try {
            URL gridUrl = new URL("http://192.168.0.111:4723/wd/hub");
            capabilities = new MutableCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:app", "file-1720943632735.apk");
            capabilities.setCapability("appium:deviceName", "10AE231R4Q0015S");
            capabilities.setCapability("appium:automationName", "UiAutomator2");
            capabilities.setCapability("appium:ensureWebviewsHavePages", true);
            capabilities.setCapability("appium:nativeWebScreenshot", true);
            capabilities.setCapability("appium:deviceFarm", "true");  // Enable Device Farm
            capabilities.setCapability("appium:newCommandTimeout", 3600);
            capabilities.setCapability("appium:connectHardwareKeyboard", true);
            driver = new AndroidDriver (gridUrl, capabilities);
            WebElement firstButton = driver.findElement(By.id("com.example.androidnative:id/button_first"));
            firstButton.click();
            WebElement secondButton = driver.findElement(By.id("com.example.androidnative:id/button_second"));
            Assert.assertTrue(secondButton.isDisplayed(), "The button should be visible");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    @Test
    public void androidNubiaDevice() throws MalformedURLException, InterruptedException {
        try {
            URL gridUrl = new URL("http://192.168.0.111:4723/wd/hub");
            capabilities = new MutableCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:app", "file-1720943632735.apk");
            capabilities.setCapability("appium:deviceName", "0123456789ABCDEF");
            capabilities.setCapability("appium:automationName", "UiAutomator2");
            capabilities.setCapability("appium:ensureWebviewsHavePages", true);
            capabilities.setCapability("appium:nativeWebScreenshot", true);
            capabilities.setCapability("appium:deviceFarm", "true");  // Enable Device Farm

            capabilities.setCapability("appium:newCommandTimeout", 3600);
            capabilities.setCapability("appium:connectHardwareKeyboard", true);
            driver = new AndroidDriver (gridUrl, capabilities);
            WebElement firstButton = driver.findElement(By.id("com.example.androidnative:id/button_first"));
            firstButton.click();
            WebElement secondButton = driver.findElement(By.id("com.example.androidnative:id/button_second"));
            Assert.assertTrue(secondButton.isDisplayed(), "The button should be visible");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}