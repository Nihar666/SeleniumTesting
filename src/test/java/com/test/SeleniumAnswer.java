package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumAnswer {
	WebDriver driver;
	
	public boolean isAlertPresent(){
		try{
			driver.switchTo().alert();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	@Test
	public void allSeleniumInterviewAnswer() throws IOException{
		driver = new FirefoxDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Alert text = driver.switchTo().alert();

		System.out.println(text.getText());
		
		System.out.println("=================");
		
		driver.switchTo().frame(0);//based on index
		driver.switchTo().frame("frame");//based on name
		driver.switchTo().frame(driver.findElement(By.xpath("")));//based on WebElement
		
		System.out.println("=====================");
		
		String pwwindow = driver.getWindowHandle();//give parent window id
		Set<String> allwindows = driver.getWindowHandles();//it will give you all the window id in the UI
		Iterator<String> allwindow = allwindows.iterator(); 
		String childwindow = allwindow.next();
		driver.switchTo().window(pwwindow);
		
		driver.switchTo().defaultContent();
		
		System.out.println("======================");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//timeout exception
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		System.out.println("=====================");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		System.out.println("==================");
		
		Select sel = new Select(driver.findElement(By.xpath("")));
		sel.selectByIndex(0);
		sel.selectByValue("");
		sel.selectByVisibleText("");
		List<WebElement> op = sel.getOptions();
		
		System.out.println("===========");
		
		Actions act1 = new Actions(driver);
		
		act1.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		act1.perform();
		
		System.out.println("===============");
		
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\test\\screenshot\\login"+".png"));
		
		System.out.println("===================");
		
		WebElement ele = 
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point positions = driver.manage().window().getPosition();
		positions.getX();
		positions.getY();
		
		System.out.println("===========");
		
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.switchTo().defaultContent();
		
		System.out.println("============");
		String url = driver.getCurrentUrl();
		driver.getTitle();
		
		System.out.println("==============");
		
		
		
		
		
		
	}

}
