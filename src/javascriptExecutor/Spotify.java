package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
	WebElement log_in=	driver.findElement(By.xpath("//*[text()='Log in']"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();",log_in);
	  Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@id='login-username']"));
		js.executeScript("arguments[0].value='aaavvv'", username);
		
	
	}

}
