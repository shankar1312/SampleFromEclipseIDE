package com.learn.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.partialLinkText("English")).click();
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.close();
		driver.quit();

	}

}
