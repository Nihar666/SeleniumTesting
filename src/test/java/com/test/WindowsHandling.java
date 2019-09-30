package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {
	@Test
	public void multipleWindowhandling(){
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  String parent =driver.getWindowHandle();
		  
		  Set<String> st = driver.getWindowHandles();
		  Iterator<String> it = st.iterator();
		  while(it.hasNext()){
			  String child_window = it.next();
			  
			  if(!parent.equals(child_window)){
				  driver.switchTo().window(child_window);
				  System.out.println(driver.switchTo().window(child_window).getTitle());
				  driver.close();
			  }
			  }
		     driver.switchTo().window(parent);
	}

}
