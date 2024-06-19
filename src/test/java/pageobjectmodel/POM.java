package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
	WebDriver driver;

	POM(WebDriver d)
	{
		this.driver=d;

	}

	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By button = By.xpath("//input[@id='login-button']");



	public void enterUN(String un) {

		driver.findElement(username).sendKeys(un);
	}

	public void enterPWD(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void clicktobutton() {

		driver.findElement(button).click();
	}



}


