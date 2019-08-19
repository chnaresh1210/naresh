package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		    File f = new File("C:\\Users\\suresh\\Desktop\\FBLogIn.xlsx");
			
		    FileInputStream fis = new FileInputStream(f);
		    
		    XSSFWorkbook w = new XSSFWorkbook(fis);
		    
	        XSSFSheet s = w.getSheetAt(0);               //XSSF it is a class it reprasent the ".xlsx" file formate
	        
	                                                     //HSSF it is a class it reprasent the ".xls"  file formate
	        s.getRow(1).createCell(2).setCellValue("chnaresh1210@gmail.com");
	
	        s.getRow(2).createCell(2).setCellValue("naresh007");
	        
	        fis.close();
	        
	        FileOutputStream fos= new FileOutputStream(f);
	        
	        w.write(fos);
	}

}
