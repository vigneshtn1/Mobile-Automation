package com.appium;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter dff = DateTimeFormatter.ofPattern("dd");
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime futureDate = currentDate.plusDays(3);
        String date = dff.format(futureDate);
        System.out.println(date);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.findElement(By.xpath("//span[@data-cy='closeModal'][@class='commonModal__close']")).click();
			System.out.println("Login Popup is displayed");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//input[@id='departure']/ancestor::div[1]")).click();
		
		
		//List<WebElement> allDate = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day')]"));
		
		List<WebElement> allDate = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for (WebElement webElement : allDate) {
			String str = webElement.getAttribute("aria-label");
			System.out.println(str);
			if(str.contains(date)) {
				driver.findElement(By.xpath("//div[@aria-label='"+str+"']")).click();
				System.out.println("Correct date is clicked");
				break;
			}
		}

	}

}
