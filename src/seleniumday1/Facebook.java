package seleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Ce%7Cfacebook%7C&placement=&creative=550525804944&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9061894%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuvaxG_TdcPhr1i5rjAIN71FAxIPrGuNB2yNY9KyfoNVXkuuxvxFjloaAlspEALw_wcB");
		
		
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		System.out.println("java");
		System.out.println("java1");
		System.out.println("python");

		

		
		driver.quit();
		
		
		
	}
	
	

}
