package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ABCD1 {
	//@BeforeMethod
	@BeforeClass
	public void login(){
		System.out.println("login successful");
	}
	
	//@AfterMethod
	@AfterClass
	public void logout(){
		System.out.println("logout successful");
	}
	
	@Test
	public void fundTransfer(){
		System.out.println("fund transfer");
	}
	
	@Test
	public void prapaidRecharge(){
		System.out.println("prepaid recharge");
	}
	
	@Test
	public void billPayment(){
		System.out.println("bill payment");
	}
}
