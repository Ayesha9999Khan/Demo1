package multipleChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program2 {
	public static void main(String[] args) {
 
	WebDriver driver = null;
	String driverName ="chrome";
	
	if(driverName.equalsIgnoreCase("chrome") ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	else if(driverName.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	    driver =new EdgeDriver();
	}
	
	driver.get("https://www.facebook.com/");
}
}