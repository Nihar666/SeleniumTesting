package com.wordpress.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelDataConfig;

public class WordPressLoginExcelTest {

	WebDriver driver;
	
	@Test(dataProvider="wordpressData")
	public void loginToWordpress(String username, String password){
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login - Invalid Credential");
		System.out.println("Page Title verified - user is able to login Successfully");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name ="wordpressData")
	public Object[][] passData(){
		ExcelDataConfig config = new ExcelDataConfig("E:\\SOFTWARE\\SELENIUM\\Eclipse_Workspace\\SeleniumTesting\\TestData\\inputData.xlsx");
		
	int rows=config.getRowCount(0);
	
	Object[][] data = new Object[rows][3];
	
	for (int i = 0; i < rows; i++) {
		
		data[i][0] =config.getData(0, i, 0);
		data[i][1] =config.getData(0, i, 1);

	}
	return data;
	
	}
	
	
	
	
	
	
}
