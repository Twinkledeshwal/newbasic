  package datadriventesting;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception {
        driver = new ChromeDriver();
 		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider ="container1")
	public void login(String username,String password ) {

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		String expected="Admin";
		String actual=driver.findElement(By.xpath("//span[text()='Admin']")).getText();
	
		Assert.assertEquals(expected, actual);
		driver.quit();
	}
	@DataProvider()
	public Object[][] container() {
		return new Object[][] {
			
			{"Admin","admin123"},
			{"tom","jerry"},
			{"ram","shyam"},
		        };
		  }
	 
	@DataProvider()
	public Object[][] container1() {
		Object[][] data= new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="tom";
		data[1][1]="jerry";
		return data;
		
		  }










}
