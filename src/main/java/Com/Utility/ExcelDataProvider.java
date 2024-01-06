package Com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
XSSFWorkbook workb;
	
	public void getdata() throws IOException 
	{
		String excelpath=System.getProperty("user.dir")+"\\ExcelTestData\\Data.xlsx";
		File src=new File(excelpath);
		
		FileInputStream file=new FileInputStream(src);
		workb=new XSSFWorkbook(file);
	}
	//for string data
	public String getStringData(String sheetname, int row, int column)
	{
		return workb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	//for numeric data
	public double getNumericData(String sheetname, int row, int column)
	{
		return workb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}

}






