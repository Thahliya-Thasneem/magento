package magneto.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	public static String getCellValue(String xl,String sheet,int r,int c) {
		try {
			FileInputStream fi=new FileInputStream(xl);
			
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			
			if(cell.getCellType()==CellType.STRING) {
				return cell.getStringCellValue();
			}
			else {
				//double v=cell.getNumericCellValue();
				//int val=(int)v; //type casting
				//return String.valueOf(val);
				return cell.getRawValue();
			}
		}
		catch(Exception e) {
			return "";
		}
	}
	public static int getRowCount(String xl,String sheet) {
		try {
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {
			return 0;
			
		}
		}
	public static int getCellCount(String xl,String sheet,int r) {
		try {
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getRow(r).getLastCellNum();
		}
		catch(Exception e) {
			return 0;
		}
	}

}
