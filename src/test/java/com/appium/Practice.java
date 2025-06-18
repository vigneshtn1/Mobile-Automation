package com.appium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class Practice {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('nav-link-accountList-nav-line-1').click();");
		driver.findElement(By.id("ap_email_login")).sendKeys("a2stestsubs+raprod4@amazon.com");
		js.executeScript("document.getElementById('continue-announce').click();");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/span/form/span/span/input")).click();
		//js.executeScript("document.getElementById('ap_password').value='Al3x@Test';");
		driver.findElement(By.id("ap_password")).sendKeys("Al3x@Test");
		//driver.findElement(By.id("signInSubmit")).click();
		js.executeScript("document.getElementById('signInSubmit').click();");
		
		//driver.get("https://www.amazon.com/");
		//Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		//js.executeScript("document.getElementId('nav-link-accountList-nav-line-1').click()");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[2]/div/div/ul/li[2]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/a[3]/div/div/span")).click();
		
		
		
		
		
//		js.executeScript("document.getElementById('nav-link-accountList-nav-line-1').click();");
//		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		js.executeScript("arguments[0].click();",signin);
		
	}
	
}
