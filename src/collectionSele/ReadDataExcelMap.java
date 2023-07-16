package collectionSele;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadDataExcelMap {
	
	public static void main(String [] args) throws IOException
	{
		String path="E:\\eclipse-workspace\\SeleniumBasic\\SeleniumConcept\\SampleStateC.xlsx";
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=wb.getSheetAt(0);
	String data=sheet.getRow(0).getCell(0).getStringCellValue();

	HashMap<String, String> map
    = new HashMap<String, String>();

for (int r = 0; r <= sheet.getLastRowNum(); r++) {
    String key = sheet.getRow(r)
                  .getCell(0)
                  .getStringCellValue();
    String value = sheet.getRow(r)
                       .getCell(1)
                       .getStringCellValue();
    map.put(key, value);
}

// Displaying HashMap
for(Entry<String,String> all_value: map.entrySet())
{
	
    System.out.println(all_value.getKey() + "|"
                       + all_value.getValue());
}

}

	}


