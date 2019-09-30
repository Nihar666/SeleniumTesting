package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Utility.BrowserFactory;
import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPageNew;

public class VerifyValidLogin {
    @Test
	public void checkValidUser(){
		WebDriver driver =BrowserFactory.startBrowser("chrome", "https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	    
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
        
		//LoginPage login_page_pld=PageFactory.initElements(driver, LoginPage.class);
		login_page.login_wordpress("niharpatelblogs", "sachinnihar");
		
    }
}
