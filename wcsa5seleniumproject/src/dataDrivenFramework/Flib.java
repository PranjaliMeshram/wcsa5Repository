package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//to store generic reusable methods
	//all the methods are non static

	//it is used to read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); //provide the file 
		Workbook wb = WorkbookFactory.create(fis); //make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); //get into the sheet
		Row row = sheet.getRow(rowCount); //get into the desired row
		Cell cell = row.getCell(cellCount); //get into the desired cell
		String data = cell.getStringCellValue(); //read the value from cell
		return data;
	}

	//it is used to get the last count of row where we store data
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of file
		Workbook wb = WorkbookFactory.create(fis); //to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); //get into the sheet
		int rc = sheet.getLastRowNum(); //read the last row count
		return rc;
	}

	//it is use to write the data into excel sheet
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of file
		Workbook wb = WorkbookFactory.create(fis); //to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); //get into the sheet
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data); //pass the string argument data

		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
}
