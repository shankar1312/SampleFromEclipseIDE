package com.learn.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * By.id(null) 
		 * By.name(null) 
		 * By.className(null) 
		 * By.tagName(null)
		 * 
		 * By.linkText(null)
		 * By.partialLinkText(null)
		 * 
		 * By.cssSelector(null) 
		 * By.xpath(null)
		 */
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		driver.findElement(By.id("userName")).sendKeys("Shankar12345");
		driver.findElement(By.id("usrPwd")).sendKeys("AutoDemo123");
		driver.findElement(By.name("cnfUsrPwd")).sendKeys("AutoDemo123");
		
		driver.findElement(By.xpath("//span[text() = 'Preferred Language']")).click();
		driver.findElement(By.xpath("//li/span[text()= 'English']")).click();
		
		driver.findElement(By.xpath("//span[text() = 'Security Question']")).click();
		driver.findElement(By.xpath("//li/span[text()= 'What is your pet name?']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder = 'Security Answer']")).sendKeys("Dog");
				
		driver.findElement(By.xpath("//button[@label = 'Continue']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Shankar");
		
		driver.findElement(By.xpath("//span[text() = 'Select Occupation']")).click();
		driver.findElement(By.xpath("//li/span[text()= 'PROFESSIONAL']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder = 'Date Of Birth']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@class, 'ui-datepicker-month')]"));
		Select ddMonth = new Select(month);
		//dd.selectByValue("2");
		ddMonth.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.xpath("//select[contains(@class, 'i-datepicker-year')]"));
		Select ddYear = new Select(year);
		ddYear.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//a[text() = '3']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'martitalS' and @value = 'M']")).click();
		
		driver.close();
		driver.quit();
	}

}
