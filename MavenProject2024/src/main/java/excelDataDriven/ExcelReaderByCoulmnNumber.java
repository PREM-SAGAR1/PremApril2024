package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByCoulmnNumber
{
	
	public static void main(String[] args) throws Exception
	{
		
       FileInputStream fis = new FileInputStream("C:\\Users\\Prem\\Desktop\\testdata11.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = wb.getSheet("login");
	XSSFRow row = sheet.getRow(0);
	
	XSSFCell cell = null;
	int CellIndex=0;
	for(int i=0;i<row.getLastCellNum();i++)
	{
		if(row.getCell(i).getStringCellValue().trim().equals("Password"))
			CellIndex=i;
	
	}
	row = sheet.getRow(1);
	cell = row.getCell(CellIndex);
	String str = cell.getStringCellValue();
	System.out.println(str);
	
	wb.close();
	fis.close();
	
	
	
	}

}
