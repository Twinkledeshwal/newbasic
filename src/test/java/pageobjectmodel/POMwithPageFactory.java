package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMwithPageFactory {
	WebDriver driver;

	POMwithPageFactory(WebDriver d)
	{
		this.driver=d;
PageFactory.initElements(d, this);
	}
	
	
	
@FindBy(xpath ="//input[@id='user-name']") 
WebElement username;
@FindBy(xpath ="//input[@id='password']") 
WebElement password;

@FindBy(xpath ="//input[@id='login-button']") 
WebElement button;
	
	



	public void enterUN(String un) {

		username.sendKeys(un);
	}

	public void enterPWD(String pwd) {

		password.sendKeys(pwd);
	}

	public void clicktobutton() {

		button.click();
	}

}
