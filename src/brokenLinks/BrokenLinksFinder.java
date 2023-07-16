package brokenLinks;

	import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BrokenLinksFinder {
	    public static void main(String[] args) {
	     

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the webpage
	        driver.get("http://www.zlti.com");

	        // Find all anchor tags on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Iterate through each link and check if it's broken
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                try {
	                URL url_link=new URL(url);
	                    HttpURLConnection connection = (HttpURLConnection)url_link.openConnection();
	                    //connection.setRequestMethod("HEAD");
	                    connection.connect();

	                    int responseCode = connection.getResponseCode();
	                    if (responseCode >= 400) {
	                        System.out.println("Broken Link: " + url);
	                    } else {
	                        System.out.println("Valid Link: " + url);
	                    }
	                } catch (Exception e) {
	                    System.out.println("Error occurred while checking the link: " + url);
	                }
	            }
	        }

	        // Quit the driver
	        driver.quit();
	    }
	}


