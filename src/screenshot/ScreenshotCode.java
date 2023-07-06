package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCode {
public void captureSCreenshot(WebDriver driver,String filename) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"\\screenshot\\"+filename+".png";
    File des=new File(path);
    FileHandler.copy(src,des);
}
}
