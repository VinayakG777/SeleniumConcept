package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDwnHyrt1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement drop_down=driver.findElement(By.id("ide"));
		Select s=new Select(drop_down);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
	List<WebElement> opt=	s.getAllSelectedOptions();
	for(WebElement wb:opt)
	{
		System.out.println(wb.getText());
	}
	
	}

}
