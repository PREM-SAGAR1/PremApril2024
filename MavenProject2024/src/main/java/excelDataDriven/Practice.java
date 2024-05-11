package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Prem\\Desktop\\testdata11.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("login");
		
		XSSFRow row = sheet.getRow(0);
		

		XSSFCell cell= null;
     
		int cellindex=0;



		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Result"))
				cellindex=i;
		}
		
		
		
		row=sheet.getRow(3);
		
		cell=row.getCell(cellindex);
		
		
		cell.setCellValue("Romeo");
XSSFFont font = wb.createFont();
		
		font.setFontName("Arial Black");
		font.setFontHeight(16);
		font.setBold(true);
		 
		XSSFCellStyle style = wb.createCellStyle();
		style.setFont(font);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Prem\\Desktop\\testdata11.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		fos.close();
	}}