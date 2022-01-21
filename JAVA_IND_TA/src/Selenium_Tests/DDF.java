package Selenium_Tests;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DDF 
{
	public static int xlRows,xlCols;
	public static String xData[][];
	
	public static void main(String a[]) throws Exception
	{
		
		xlRead("C:\\Users\\SARAVANAN R\\Desktop\\Test Automation\\AmazonDataFrameworks.xls");
		
	}
	
	
	public static void xlRead(String sPath) throws Exception
	{
		File myFile=new File(sPath);
		FileInputStream myStream=new FileInputStream(myFile);
		HSSFWorkbook myWorkbook=new HSSFWorkbook(myStream);
		HSSFSheet mySheet=myWorkbook.getSheetAt(0);
		xlRows=mySheet.getLastRowNum()+1;
		xlCols=mySheet.getRow(0).getLastCellNum();
		System.out.println("Row Count is "+xlRows);
		System.out.println("Col Count is "+xlCols);
		xData =new String[xlRows][xlCols];
		for (int i=0;i<xlRows;i++)
		{
			HSSFRow row=mySheet.getRow(i);
			for (short j=0;j<xlCols;j++)
			{
				HSSFCell cell=row.getCell(j);
				String value=cellToString(cell);
				xData[i][j]=value;
				System.out.print(xData[i][j]+"    ");
			}
			System.out.println();
		}
	}
	public static String cellToString(HSSFCell cell)
		{
		int type=cell.getCellType();
		Object result;
		switch(type)
		{
		case HSSFCell.CELL_TYPE_NUMERIC:
		result=cell.getNumericCellValue();
		break;
		case HSSFCell.CELL_TYPE_STRING:
		result=cell.getStringCellValue();
		break;
		case HSSFCell.CELL_TYPE_FORMULA:
		throw new RuntimeException("We cannot evaluate formula");
		case HSSFCell.CELL_TYPE_BLANK:
		result="-";
		case HSSFCell.CELL_TYPE_BOOLEAN:
		result=cell.getBooleanCellValue();
		case HSSFCell.CELL_TYPE_ERROR:
		result="This Cell has some error";
		default:
		throw new RuntimeException("We do not evaluate this data");
		}
		return result.toString();
		}


}
