package multiWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='checkBoxClassB']"));
		for(WebElement temp:checkbox) {
			temp.click();
			Thread.sleep(2000);
			temp.click();
		
		}
		
		
		
		
		
		
	}
}
