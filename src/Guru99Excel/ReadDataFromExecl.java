package Guru99Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadDataFromExecl {

	
	 public void readExcel(String filePath,String fileName,String ReadandWrite) throws IOException{

		    //Create an object of File class to open xlsx file

		    File file =    new File("C:\\Users\\suresh\\Desktop\\ReadandWrite.xlsx" +"\\"+ReadandWrite);

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    XSSFWorkbook naresh = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    naresh = new XSSFWorkbook(inputStream);

//		    }
//
//		    //Check condition if the file is xls file
//
//		    else if(fileExtensionName.equals(".xls")){
//
//		        //If it is xls file then create object of HSSFWorkbook class
//
//		        naresh = new HSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    Sheet sheet = (Sheet) naresh.getSheet(ReadandWrite);

		    //Find number of rows in excel file

		    int rowCount = ((XSSFSheet) sheet).getLastRowNum()-((XSSFSheet) sheet).getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it

		    for (int i = 0; i < rowCount+1; i++) {

		        Cell[] row = sheet.getRow(i);

		        //Create a loop to print cell values in a row

//		        for (int j = 0; j < row.length; j++) {
//
//		            //Print Excel data in console
//
//		            System.out.print(row.length.getStringCellValue()+"|| ");
//
//		        }

		        System.out.println();
		    } 

		    }  

		    //Main function is calling readExcel function to read data from excel file

		    public static void main(String...strings) throws IOException{

		    //Create an object of ReadGuru99ExcelFile class

		    	ReadDataFromExecl objExcelFile = new ReadDataFromExecl();

		    //Prepare the path of excel file

		    String filePath = System.getProperty("user.dir")+"E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab\\src\\Guru99Excel\\ReadDataFromExecl.java";

		    //Call read file method of the class to read data

		    objExcelFile.readExcel(filePath,"C:\\Users\\suresh\\Desktop\\ReadandWrite.xlsx","Sheet1");

		    }
}
