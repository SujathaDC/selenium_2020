package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	WebDriver driver;	
		
@DataProvider
public String[][] dataSender(){
			String data[][]= {
					{"user","user"},
					{"dcsujatha047@gmail.com","Adhya@123"}
			};
			return data;
		}
		
		@Test(dataProvider="dataSender")
		public void login(String[] cred) {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demoapp.skillrary.com/login.php?type=login");
				driver.findElement(By.name("email")).sendKeys(cred[0]);
				driver.findElement(By.name("password")).sendKeys(cred[1]);
			}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		}





