package multiWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	List<WebElement> lists = driver.findElements(By.xpath("//li[@class='menu-list header-icon-menu']/a"));
	for(WebElement menu: lists) {
		System.out.println(menu.getText());
	}
	
	
	
	
	
	
	
	
	
	
}
}
