package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	
	String titleget = driver.getTitle();
	System.out.println( titleget);
	Thread.sleep(2000);
	
	String curnturl = driver.getCurrentUrl();
	System.out.println(curnturl);
	Thread.sleep(2000);
	
	String pgesource = driver.getPageSource();
	System.out.println(pgesource);
	Thread.sleep(2000);
	
	WebElement title = driver.findElement(By.xpath("//div[text()='Best of Electronics']"));
	System.out.println(title.getText());
	Thread.sleep(2000);
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']"));
	for(WebElement lists:elements) {
		System.out.println(lists.getText());
	}
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
