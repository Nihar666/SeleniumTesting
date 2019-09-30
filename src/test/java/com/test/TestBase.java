package com.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	static Properties properties;
	
	public static void loadData() throws IOException{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"E:\\SOFTWARE\\SELENIUM\\Eclipse_Workspace\\SeleniumTesting\\src\\test\\java\\com\\test\\Test1.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
		
	}
	
	public static  String getObject(String Data) throws IOException{
		loadData();
		String data=properties.getProperty(Data);
		return data;
	}

}
