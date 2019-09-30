package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleGmail {
	@Test
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.espncricinfo.com/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  String actual = driver.getTitle();
		  System.out.println(actual);
		  Assert.assertEquals(actual, "ESPN Cricinfo - Cricket Live Scores, Stats, Schedules, Fixtures & News");
		  //ESPN Cricinfo - Cricket Live Scores, Stats, Schedules, Fixtures & News
		  
	}

}
