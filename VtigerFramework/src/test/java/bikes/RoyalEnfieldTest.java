package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfieldTest {
	
	@Test(groups="integresion")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("Royal Enfield launched successfully");
	}

 

}
