package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameterTwoTest {
	@Test
	public void receiveData()
	{
		String URL=System.getProperty("url");//we are entering mail id ,password ,url in cmd prompt
		String email=System.getProperty("email");
		String password=System.getProperty("password");
		Reporter.log(URL,true);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		Reporter.log("sucessfull pass", true);
		
		
	}



}
