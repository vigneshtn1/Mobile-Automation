package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	public static AndroidDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AppiumDriver driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Team's S24");
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
//        caps.setCapability("appPackage", "com.sec.android.gallery3d");
//        caps.setCapability("appActivity", "com.sec.android.gallery3d.GalleryActivity");
        caps.setCapability("automationName", "UiAutomator2");
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        //driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        
        // Number Elements
        WebElement Press1 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
        WebElement Press2 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
        WebElement Press3 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
        WebElement Press4 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
        WebElement Press5 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
        WebElement Press6 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
        WebElement Press7 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
        WebElement Press8 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
        WebElement Press9 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        WebElement Press0 = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
        
        // Mathematical Operators
        WebElement Press_add = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
        WebElement Press_sub = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
        WebElement Press_mutiple = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
        WebElement Press_div = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
        WebElement Press_percentage = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_percentage"));
        WebElement Press_equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        
        // Clear Values
        WebElement Clear_Values = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_clear"));
        
        // Get Answer Value
        WebElement Get_Answer = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
        
        // Basic Addition Function
        Press3.click();
        Press_add.click();
        Press7.click();
        Press_equal.click();
        System.out.println("Answer for 3+7="+Get_Answer.getText());
        Clear_Values.click();
        
        // Basic Subtraction Function
        Press9.click();
        Press_sub.click();
        Press1.click();
        Press_equal.click();
        System.out.println("Answer for 9-1="+Get_Answer.getText());
        Clear_Values.click();
        
        // Basic Multiplication Function
        Press2.click();
        Press_mutiple.click();
        Press4.click();
        Press_equal.click();
        System.out.println("Answer for 2*4="+Get_Answer.getText());
        Clear_Values.click();
        
        // Basic Division Function
        Press5.click();
        Press0.click();
        Press_div.click();
        Press6.click();
        Press_equal.click();
        System.out.println("Answer for 5/6="+Get_Answer.getText());
        Clear_Values.click();
        
        // Basic Percentage Function
        Press8.click();
        Press_percentage.click();
        Press_equal.click();
        System.out.println("Answer for 8%="+Get_Answer.getText());
        Clear_Values.click();

	}

}
