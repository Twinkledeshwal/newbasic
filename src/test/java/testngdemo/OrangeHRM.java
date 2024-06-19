package testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void lunchapp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void enterlogindetails() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	 @Test
	public void navigatetomyinfo() {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}
	 @Test
	public void verifymyinfo() {
		boolean text = driver.findElement(By.xpath("//h6[text()='Personal Details']")).isDisplayed();
		System.out.println(text);
	}
	 @Test
	public void verifylogin() {
		WebElement element = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}
	
	
}

