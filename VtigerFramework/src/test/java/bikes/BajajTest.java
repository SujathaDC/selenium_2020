package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

public class BajajTest {
@Test(groups="regression")
public void launch()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bajajauto.com/");
	Reporter.log("Bajaj launched successfully");
}


}
