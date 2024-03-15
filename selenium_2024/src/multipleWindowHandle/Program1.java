package multipleWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mahaconnect.in/jsp/index.html");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
