package actionClassMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClicks {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    Actions act = new Actions(driver);
	    
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dremyworld");
		  act.click();
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123@123");
		  act.contextClick();
	      driver.findElement(By.xpath("//div[@class='_6ltg'][1]"));
	      act.doubleClick();
	   
	   
	   
	   
	   
	}
}
