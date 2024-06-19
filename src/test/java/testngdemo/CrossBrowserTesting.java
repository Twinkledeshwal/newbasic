package testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTesting {
	WebDriver driver;
	 @Parameters ("browserName") 
       @BeforeTest()
	public void launchbrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();	

		}else if (browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();	
	}else {
		System.err.println("invalid browseName");}
	}
   @Parameters ({"username","password"}) 
	@Test()
	public void orangehrm(String username, String password) {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	String expected="Admin";
	String actual=driver.findElement(By.xpath("//span[text()='Admin']")).getText();

	Assert.assertEquals(expected, actual);
	}
	
	
	
}
