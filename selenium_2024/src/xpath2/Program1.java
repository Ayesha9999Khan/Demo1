package xpath2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asbk");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
