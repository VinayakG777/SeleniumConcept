package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZltiBrokenLinks {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.zlti.com");
        List<WebElement> all_links = driver.findElements(By.tagName("a"));
        for (WebElement one_link : all_links) {
            String link = one_link.getAttribute("href");
            URL url = new URL(link);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpUrlConnect = (HttpURLConnection) urlConnection;
            Thread.sleep(5000);
            httpUrlConnect.connect();
            int response = httpUrlConnect.getResponseCode();
            if (response >= 400) {
                System.out.println("Broken Link: " + link);
            }
            httpUrlConnect.disconnect();
        }
        driver.quit();
    }
}
