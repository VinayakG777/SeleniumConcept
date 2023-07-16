package brokenLinks;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink
{
	@Test
	public static void countLinks()
	{
	ChromeOptions s=new ChromeOptions();
	s.addArguments("--remote-allow-origins=*");
	ChromeDriver driver= new ChromeDriver(s);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	List<WebElement> list = driver.findElements(By.tagName("a"));
	int count=list.size();
	System.out.println(count);
	 long stTime=System.currentTimeMillis();
	
	for(int i=0;i<count;i++)
	{
		String url=list.get(i).getAttribute("href");
		setConnection(url);
			
	}
	long endTime=System.currentTimeMillis();
	
	System.out.println("time taken to test"+(endTime-stTime));
	
	}
	
	public static void setConnection(String url)
	{
		try
		{
			URL Url=new URL(url);
			HttpURLConnection htturlConnection=(HttpURLConnection) Url.openConnection();
			htturlConnection.setConnectTimeout(5000);
			htturlConnection.connect();
			
			if(htturlConnection.getResponseCode()>=400)
			{
				System.out.println(url+"------>"+htturlConnection.getResponseMessage()+"this link is Broken");
				
			}
			else
			{
				System.out.println(url+"------>"+htturlConnection.getResponseMessage()+"this link is not Broken link");
				
			}
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
	

}
