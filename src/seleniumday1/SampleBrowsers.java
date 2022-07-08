package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleBrowsers {
public static void main(String[] args) {
	System.setProperty("Webdriver.Chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	List<WebElement> allinks = driver.findElements(By.tagName("a"));
	int totallinkcount = allinks.size();
	System.out.println(totallinkcount);
	for (WebElement link : allinks) {
		String att = link.getAttribute("href");
		System.out.println(att);
		
		
	}
}
}
