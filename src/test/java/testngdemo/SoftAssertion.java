package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertion {
	@Test
	public void failed() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.yatra.com/");
	WebElement bg=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	String actualBg=bg.getCssValue("background");
	System.out.println(actualBg);
String expectedBg="rgb(34, 142, 2333) none repeat scroll 0% 0% / auto padding-box border-box";
Assert.assertEquals(actualBg, expectedBg);
	}
}