package com.test;

import org.testng.annotations.Test;

public class PriorityWiseTest {
	@Test (priority = 1)
	public void login(){
		System.out.println("login successful");
	}
	
	@Test (priority = 3)
	public void search(){
		System.out.println("Search operation successful");
	}
	
	@Test (priority = 2)
	public void logout(){
		System.out.println("logout successful");
	}
	
	

}
