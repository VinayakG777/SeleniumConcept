package apachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	String path="E:\\eclipse-workspace\\basicJava\\SeleniumBasic\\saucelabLogin1.xlsx";
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	
	File file2=new File(path);
FileOutputStream fos=new FileOutputStream(file2);
sheet.getRow(0).createCell(2).setCellValue("pass");
sheet.getRow(1).createCell(2).setCellValue("fail");
  wb.write(fos);
  wb.close();
}
}
