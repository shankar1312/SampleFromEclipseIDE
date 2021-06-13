package com.learn.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchBrowser 
{

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();

		//options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		//options.addArguments("--start-maximized");
		//options.addArguments("--incognito");
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		//driver.get("https://demoqa.com/");
		//driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		//driver.close();  // To close the browser
		//driver.quit();   // To close the browser driver
		
		
		
		/*
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		 */
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
		
	}

}
