package com.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProperties extends TestBase {
	@BeforeClass
	public void init() throws IOException{
		
	}
	@Test
	public void testProperties() throws IOException{
		String name = getObject("Name");
		System.out.println(name);
	}

}
