package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\suresh\\Desktop\\ExeclWriter.xlsx");
		
	    FileInputStream fin = new FileInputStream(f);
	    
	    XSSFWorkbook w = new XSSFWorkbook(fin);
	    
	    XSSFSheet s =w.getSheetAt(0);
	    
	    s.getRow(1).createCell(2).setCellValue("choppara");
	   
	    s.getRow(2).createCell(2).setCellValue("karumanchi");
	    
	    s.getRow(0).createCell(3).setCellValue("website");
	    
	    s.getRow(1).createCell(3).setCellValue("google");
	    
	    s.getRow(2).createCell(3).setCellValue("youtube");
	    
	    fin.close();
	
	    FileOutputStream fos = new FileOutputStream(f);
	    
	    w.write(fos);
	
	
	
	
	
	
	
	
	}
}
