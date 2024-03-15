package multipleChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	 
	WebDriver driver=null;
	String drivername="chrome";
	
	if(drivername.equalsIgnoreCase("chrome")) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	driver =new ChromeDriver();
	}
	
	else if(drivername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.Firefox .driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		driver=new FirefoxDriver();
	}
	
	else if(drivername.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	}
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
}
}
