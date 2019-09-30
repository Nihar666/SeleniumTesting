package com.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyBrokenLinks {
     @Test
     public void verifyBrokenlinks(){
    	 System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe" );
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://google.com");
 		
 		List<WebElement> links = driver.findElements(By.tagName("a"));
 		System.out.println("Number of links present in the Pages are::"+links.size());
 		
 		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
			
		}
     }
     
     public static void verifyLinkActive(String linkUrl){
    	 try{
    		 URL url = new URL(linkUrl);
    		 HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
    		 httpUrlConnect.setConnectTimeout(3000);
    		 httpUrlConnect.connect();
    		 
    		 if(httpUrlConnect.getResponseCode()==200){
    			 System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage());
    		 }if(httpUrlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
    			 System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage());
    			 
    		 }
    	 }catch(Exception e){
    			 
    		 }
    	 }
}
