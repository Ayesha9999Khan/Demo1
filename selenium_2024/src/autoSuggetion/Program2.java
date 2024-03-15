package autoSuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).sendKeys("iphone");
		Thread.sleep(2000);
		
	    List<WebElement> lists = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div[2]/div/div[1]/div/div/div[1]"));
		System.out.println(lists.size());
		
		for(WebElement auto2:lists) {
		System.out.println(auto2.getText());	
		}
		
		
		
	}
}
