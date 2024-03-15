package xpath2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//a[starts-with(text(),'Fo')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[ends-with(text(),'password')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
}
