package com.juaracoding.shopdemo.hooks;

import com.juaracoding.shopdemo.drivers.DriverSingleton;
import com.juaracoding.shopdemo.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
    }

    @AfterAll
    public static void tearDown(){
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
