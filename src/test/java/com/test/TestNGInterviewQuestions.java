package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGInterviewQuestions {
	@Test
	public void testCase1(){
		System.out.println("in Test case 1");
	}
	@Test
	public void testCase2(){
		System.out.println("in Test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("in before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("in after method");
	}
	

}
