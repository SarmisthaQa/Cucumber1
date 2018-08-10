package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtility {
	
	  private static HSSFSheet ExcelWSheet;
      private static HSSFWorkbook ExcelWBook;
      private static HSSFCell Cell;
	
	public static void setExcelSheet(String path, String sheetName) throws IOException {
		FileInputStream excelFile= new FileInputStream(path);
		ExcelWBook = new HSSFWorkbook(excelFile);
		ExcelWSheet= ExcelWBook.getSheet(sheetName);
	}
	public static String getCellData(int RowNum, int ColNum) throws Exception{
  	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        String CellData = Cell.getStringCellValue();
        return CellData;
  	}
	public static void setCellData(int RowNum, int ColNum, String data) throws Exception{
	  	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	        Cell.setCellValue(data);
	        
	  	}
}
