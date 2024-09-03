package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriventesting {
	
	@Test
public void datafetch() throws IOException {
	//used to create a reference to a file located at the specified path
	File f1= new File("./src/test/resources/testdata/datadriven.xlsx");
	//object that allows you to read bytes from the file
	FileInputStream fis= new FileInputStream(f1);
	
        XSSFWorkbook book= new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("Sheet1");

       int numofrow = sheet.getPhysicalNumberOfRows();   //7
        int numofcol= sheet.getRow(0).getLastCellNum();   //2

       System.out.println(numofrow);
       System.out.println(numofcol);

       for(int i=0; i<numofrow-1;i++) {                                                  //0 to  i<6            0 ,1 ,2, 3, 4, 5
	for(int j=0; j<numofcol;j++) {                                               //0  to j<2          0 1 
		System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());   //  1 2 3 4 5 6
	    }
     }

        /*
	    XSSFRow row = sheet.getRow(4);
	    XSSFCell cell = row.getCell(1);
	    System.out.println(cell.getStringCellValue());
       */ 
        
        
        
	
	
	
	
	}
}














