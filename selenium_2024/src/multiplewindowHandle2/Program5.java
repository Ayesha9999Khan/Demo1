package multiplewindowHandle2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='s-item__title'])[2]")).click();
	Thread.sleep(2000);
	Set<String> nxtpge = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(nxtpge);
	Thread.sleep(2000);
	
	driver.switchTo().window(al.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	
	Thread.sleep(2000);
	driver.switchTo().window(al.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn--primary btn--large']")).click();
	
	
	
	
	
	
	
}
}
