package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	@Test
	public void test1(){
		Assert.assertEquals(12, 13);
	}
	
	@Test
	public void test2(){
		System.out.println("Test case2 stared::");
		Assert.assertEquals(12, 13,"Dropdown count doesnot match please check with developer");
		System.out.println("Test case 2 completed");
	}
	
	@Test
	public void test3(){
		System.out.println("Test case3 stared::");
		Assert.assertEquals("Hello", "Hello","Words doesnot match please raise a bug");
		System.out.println("Test case 3 completed");
	}

}
