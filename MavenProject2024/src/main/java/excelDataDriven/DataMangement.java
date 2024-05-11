package excelDataDriven;

public class DataMangement {

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\Prem\\Desktop\\suitea1.xlsx");

	String sheetName = "Data";
	String testCaseName = "TestB";
	
	int testStartRowNum =0;
	
	while(!e.getCellData(sheetName,0, testStartRowNum).equals(testCaseName))
	{
		testStartRowNum++;	
	}
	System.out.println("Test start from now : "+testStartRowNum);
	
	int colStartRowNum = testStartRowNum+1;
	
	int dataStartRowNum = testStartRowNum+2;
	
	//calculate rows of data
	
	int rows=0;
	
	while(e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(" "))
	{
		rows++;
	}
	
	System.out.println("total rows are : -"+rows);
	
	
	//calculate total columns
	
	int cols=0;
	while(!e.getCellData(sheetName, cols, dataStartRowNum).equals(" "))
	{
		cols++;
	}
	
	//read the data
	
	for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
	{
		for(int cNum=0;cNum<cols;cNum++) 
		{
			System.out.println(e.getCellData(sheetName, cNum, rNum));
		}
	}
	
	}

}
