package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameterTest {
	@Test
	public void receiveData()
	{
		String URL=System.getProperty("url");
		Reporter.log(URL,true);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
	}

}
