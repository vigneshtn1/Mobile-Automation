package com.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_WebElement_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		WebElement sample = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[3]/button"));
		String color = sample.getCssValue("background-color");
		
		System.out.println(color);
		
		// Convert RGBA to HEX
		String hexColor = convertRGBAtoHex(color);
		System.out.println("HEX Color: " + hexColor);

		// Method to convert RGBA to HEX

	}
	
	public static String convertRGBAtoHex(String color) {
	    String[] values = color.replace("rgba(", "").replace(")", "").split(",");
	    System.out.println(values);
	    int r = Integer.parseInt(values[0].trim());
	    int g = Integer.parseInt(values[1].trim());
	    int b = Integer.parseInt(values[2].trim());
	    System.out.println(r);
	    
	    return String.format("#%02x%02x%02x", r, g, b);
	}

}
