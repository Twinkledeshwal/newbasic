package testngdemo.crossBrowserPolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static void main(String[] args) {
		ClassA.test(new ChromeDriver());
		ClassA.test(new FirefoxDriver());
		ClassA.test(new EdgeDriver());

	}

}
