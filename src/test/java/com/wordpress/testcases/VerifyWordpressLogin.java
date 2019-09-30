/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author Nihar
 *
 */
public class VerifyWordpressLogin {
    @Test
	public void verifyLogin(){
    	System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
    	
    	LoginPage login = new LoginPage(driver);
    	login.typeUserName();
    	login.typePassword();
    	login.clickOnLoginBtn();
    	System.out.println();
    	
    	driver.close();
	}
}
