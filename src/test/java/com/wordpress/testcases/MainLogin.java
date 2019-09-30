package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;

public class MainLogin {
	
	WebDriver driver;
	@Test
	public void mainlogin(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		LoginPageNew  login= PageFactory.initElements(driver, LoginPageNew.class);
		login.getUsername().sendKeys("niharpatelblogs");
		login.getPassword().sendKeys("sachinnihar");
		login.getLoginbtn().click();
		
	}

}
