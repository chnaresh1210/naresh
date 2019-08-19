package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {

	XSSFWorkbook w;
	XSSFSheet s;
    FileInputStream fin;
    File f;
    
    public void Util(String excelpath) throws IOException
    {
    	f = new File(excelpath);
    	fin  = new FileInputStream(f);
    	w = new XSSFWorkbook(fin);
    	
    }
    
    
	public void setData(int snumber , int row, int col , String mes) throws IOException
	{
		s= w.getSheetAt(snumber);
		s.getRow(row).createCell(col).setCellValue(mes);
		fin.close();
		
	}
	
}
