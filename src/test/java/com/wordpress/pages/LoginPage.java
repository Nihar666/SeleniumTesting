/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nihar
 * This class will store all the locator and method of login page
 */
public class LoginPage {
	
	WebDriver driver;
	
    By username= By.id("usernameOrEmail");
    By password=By.xpath("//input[@id='password']");
    By loginButton=By.xpath("//button[contains(text(),'Log In')]");
    
    
    public LoginPage(WebDriver driver){
    	this.driver=driver;
    }
    
    public void typeUserName(){
    	driver.findElement(username).sendKeys("niharpatelblogs");
    }
    
    public void typePassword(){
    	driver.findElement(password).sendKeys("sachinnihar");
    }
    
    public void clickOnLoginBtn(){
    	driver.findElement(loginButton).click();
    }
    
}