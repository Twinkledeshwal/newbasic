package propertiesFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadPropertiesFile {
	
	@Test
	public void test() throws Exception {
		FileReader read= new FileReader("./TestData.properties");
		
		Properties pro= new Properties();
		pro.load(read);
		
		WebDriver driver =new ChromeDriver();
		driver.get(pro.getProperty("url"));
		
		/*
1.To read the file we have to use the Java Filereader and set the path of the properties file.

FileReader reader=new FileReader("file path");

2.To use the properties file we have to import the dependency “import java.util.Properties;” and invoke the properties class
Create a Object of “Properties” class
Properties props=new Properties();

3.Then we have to load the File into the properties using the load method.
 load all the keys
props.load(reader);

4.After that, we can access the data in the properties file by using the getProperty method 

props.getProperty("Key");
		*/
	}
}
