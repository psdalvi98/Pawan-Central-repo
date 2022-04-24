package Com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\lenovo\\Maven_Project_FrameWork\\TestData\\LoginData.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		 wb=new XSSFWorkbook(fis);
		
	}

	public String getStringData(String Sheetname, int row, int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();

	
	}
}
