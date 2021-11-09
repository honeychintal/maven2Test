package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	
	@Test
	public void login_test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); //username
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); //password
		driver.findElement(By.id("btnLogin")).click(); //click on login
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.close();
	}

}
