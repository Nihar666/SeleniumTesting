package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHoverVerifyText {
	@Test
	public void verifyTextHover() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=wXXTWcyCKMWL8QfW0KfACw");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='hplogo']"));
		act.clickAndHold(ele).perform();
		
		String ToolTipText = ele.getAttribute("title");
		Assert.assertEquals(ToolTipText, "Google");
		
		System.out.println("Tooltip value is::"+ToolTipText);
		
		
		
		
		
		//span[contains(text(),'Live scores')][1]
	}
	

}
