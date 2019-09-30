package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotGoogle {
      @Test
      public void testScreenshot(){
    	  System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  
    	  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=LlWWWcvOBZTSqAGkk7ywBg");
    	  
    	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try{
			  FileUtils.copyFile(src, new File("C:\\Users\\Welcome\\Desktop\\HTML\\google.png"));
		  }catch(IOException e){
			  System.out.println(e.getMessage());
		  }
      }
}
