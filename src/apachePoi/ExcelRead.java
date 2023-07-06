package apachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		String path="E:\\eclipse-workspace\\basicJava\\SeleniumBasic\\saucelabLogin.xlsx";
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
int row_count=	sheet.getLastRowNum()+1;
int cell_count=sheet.getRow(0).getLastCellNum();
for(int i=0;i<row_count;i++)
{
	for(int j=0;j<cell_count;j++)
	{
		String s=sheet.getRow(i).getCell(j).getStringCellValue();
		   System.out.print(s+" ");
	}
	System.out.println("");
}

	}

}
