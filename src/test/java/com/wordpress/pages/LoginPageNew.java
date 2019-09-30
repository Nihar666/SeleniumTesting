/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nihar
 *
 */
public class LoginPageNew {
	
	WebDriver driver;

	
	public LoginPageNew(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(id="usernameOrEmail")
	@CacheLookup
	WebElement username;
	

	@FindBy(how=How.XPATH,using="//input[@id='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Log In')]")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(how=How.LINK_TEXT, using ="Lost your password?")
	@CacheLookup
	WebElement forgotPassword;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	
	
	
	public void login_wordpress(String uid,String pass){
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginbtn.click();
	}
	

}
