package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverPOM {
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		
		POMwithPageFactory task = new POMwithPageFactory(driver);
		//POM task= new POM(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
		task.enterUN("standard_user");
		task.enterPWD("secret_sauce");
		task.clicktobutton();
		
	
		
		
		
		
	}
	
	
	
	

}
