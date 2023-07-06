package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmRecharge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://paytm.com/recharge");
	   driver.findElement(By.xpath("//*[text()='Mobile Number']/preceding-sibling::input")).sendKeys("646545");
	driver.findElement(By.xpath("//*[text()='Operator']/preceding-sibling::input")).click();
	Thread.sleep(2000);
	String op=driver.findElement(By.xpath("//div[@class='_3xI1']")).getText();
	System.out.println(op);
	System.out.println("****************************");
	List<WebElement> op1=driver.findElements(By.xpath("//div[@class='_3xI1']"));
	for(WebElement wb:op1)
	{
	
		System.out.println(wb.getText());
	}
	Thread.sleep(10000);
	}

}
