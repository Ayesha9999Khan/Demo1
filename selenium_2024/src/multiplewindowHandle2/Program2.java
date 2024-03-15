package multiplewindowHandle2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	 List<WebElement> over = driver.findElements(By.xpath("//li[@class='hl-cat-nav__js-tab']/a"));
	 for(WebElement shubham:over) {
		 act.moveToElement(shubham).perform();
	 }
	
	Thread.sleep(2000);
	
	List<WebElement> lists = driver.findElements(By.xpath("//nav[@class='hl-cat-nav__sub-cat-col']//a"));
	for(WebElement temp:lists) {
		System.out.println(temp.getText());
	}
	
	
	
}
}
