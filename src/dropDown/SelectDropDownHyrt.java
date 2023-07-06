package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHyrt {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		
	WebElement dropDown=	driver.findElement(By.id("course"));
	  Select s=new Select(dropDown);
		/*
		 * s.selectByIndex(1); s.selectByValue("net");
		 * s.selectByVisibleText("Javascript");
		 */
	   List<WebElement> all_opt=  s.getOptions();
	   int count=all_opt.size();
	for(int i=0;i<count;i++)
	{
		String opt=all_opt.get(i).getText();
		System.out.println(opt);
	}
	}

}
