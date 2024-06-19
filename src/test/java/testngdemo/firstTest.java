package testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest {
@Test
	public void testgoogle() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");	
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("pragyan",Keys.ENTER);
	System.out.println(driver.getTitle());
		
		String expected="pragyan - Google Searchh";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual, "title mismatched");
	}
}
