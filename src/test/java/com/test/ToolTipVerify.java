package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipVerify {
	
	@Test
	public void tooltipVerify() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='hplogo']"));
		act.clickAndHold(ele).perform();
		
		
		String toolTip = ele.getAttribute("title");
		Assert.assertEquals(toolTip, "Google");
		System.out.println("The ToolTip value is::"+toolTip);
	}

}
