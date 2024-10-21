package org.testes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class AppiumDriverHelper {

    public static DesiredCapabilities getCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("appium:appPackage", "");
        capabilities.setCapability("appium:appActivity", "");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(MobileCapabilityType.UDID, "");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/");
    }

    public static AppiumDriver getDriver() {

        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        } catch (Exception e) {
            log.error("Error on driver instantiation", e);
            throw new RuntimeException(e);
        }

        return driver;

    }


}