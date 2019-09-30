package com.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MultipleTestRun {
	@SuppressWarnings("deprecation")
	@Test
	public void testA(){
		Assert.assertEquals("Google", "Google");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testC(){
		Assert.assertEquals("Gmail", "Google");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testB(){
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
