package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntegrateWithExcel {
	@Test(dataProvider = "box")
public void login(String username,String password ) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		String expected="Admin";
		String actual=driver.findElement(By.xpath("//span[text()='Admin']")).getText();
	
		Assert.assertEquals(expected, actual);
}
	
		@DataProvider(parallel = true)
		public Object[][] box() throws IOException {
			
			File f1= new File("./src/test/resources/testdata/datadriven.xlsx");
			FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int numofrow = sheet.getPhysicalNumberOfRows();
		int numofcol= sheet.getRow(0).getLastCellNum();
		
		Object[][] data= new Object[numofrow-1][numofcol];
		
		for(int i=0; i<numofrow-1;i++) {
			for(int j=0; j<numofcol;j++) {
				//System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
				
				data[i][j]=	sheet.getRow(i+1).getCell(j).getStringCellValue();		
						}
				}
return data;

		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

