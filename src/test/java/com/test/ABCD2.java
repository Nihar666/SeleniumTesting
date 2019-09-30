package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ABCD2 {
	@BeforeMethod
		//@BeforeClass
		public void login(){
			System.out.println("login successful");
		}
		
		@AfterMethod
		//@AfterClass
		public void logout(){
			System.out.println("logout successful");
		}
		
		@Test (priority = 1)
		public void search(){
			System.out.println("search completed");
		}
		
		@Test (priority = 2)
		public void advancedSearch(){
			System.out.println("advanced search completed");
		}
}
