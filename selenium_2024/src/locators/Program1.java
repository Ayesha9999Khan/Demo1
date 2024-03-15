package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.name("email")).sendKeys("asdf");
	Thread.sleep(2000);
	driver.findElement(By.className("_6lux")).sendKeys("12354");
	Thread.sleep(2000);
	driver.findElement(By.tagName("div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("passContainer")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#email")).sendKeys("jhdkj");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("passw")).click();
	Thread.sleep(2000);
	
	
	
}
}
