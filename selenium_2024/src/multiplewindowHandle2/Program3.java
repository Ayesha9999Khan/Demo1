package multiplewindowHandle2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iPhone");
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	  Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']")).click();
	 Thread.sleep(2000);
	 Set<String> cliklink = driver.getWindowHandles();
	 ArrayList<String> al=new ArrayList<String>(cliklink);
	 Thread.sleep(2000);
	 
	 driver.switchTo().window(al.get(1));
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	 Thread.sleep(2000);
	
	
	 
	 
	 
	 
	 
}
}
