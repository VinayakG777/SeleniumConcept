package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CherCherMouseEvents {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
 WebElement double_click=	driver.findElement(By.id("double-click"));
 Actions act=new Actions(driver);
 act.doubleClick(double_click).perform();
 Thread.sleep(2200);
 driver.switchTo().alert().accept();
 
}
}
