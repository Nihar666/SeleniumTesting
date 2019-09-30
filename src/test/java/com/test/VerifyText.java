package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyText {
     @Test
     public void verifyTextInAPage(){
    	 System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
 		  WebDriver driver = new ChromeDriver();
 		  driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
 		  
 		  if(driver.getPageSource().contains("cricket at the age of eleven")){
 			  System.out.println("Text is present in the webpage");
 		  }else{
 			  System.out.println("Text is not present in the webpage");
 		  }
     }
}
