package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
	
	WebDriver driver;
	
	@Test(dataProvider="wordpressData")
	public void loginTowordpress(String username, String password) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE\\SELENIUM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.id("usernameOrEmail")).sendKeys(username);
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Reader"),"User is not able to login. Invalid credentials");
		
		System.out.println("Page Title verified. User is able to login successfully");
		
		driver.close();
	}
	
	
	public void tearDown(){
		
	}
	@DataProvider(name="wordpressData")
	public Object[][] passData(){
		Object[][] data = new Object[3][2];
		data[0][0]="niharpa";
		data[0][1]="sachin";
		
		data[1][0]="niharpatelblogs";
		data[1][1]="sachinnihar";
		
		data[2][0]="bahfisf";
		data[2][1]="wgefne";
		
		return data;
		
	}

}
