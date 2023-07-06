package screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	ScreenshotCode sc=new ScreenshotCode();
	sc.captureSCreenshot(driver,"homepage");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
	sc.captureSCreenshot(driver,"productpage");
	}

}
