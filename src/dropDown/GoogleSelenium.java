package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSelenium {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("selenium");

	Thread.sleep(3000);
List<WebElement> option=	driver.findElements(By.xpath("//*[text()='selenium']"));
  for(WebElement opt:option)
  {
	  String text=opt.getText();
	  if(text.equals("selenium python"))
	  {
		  opt.click();
		  break;
	  }
	  System.out.println(opt.getText());
  }
  
}
}
