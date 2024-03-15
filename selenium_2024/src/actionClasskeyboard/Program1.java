
package actionClasskeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		search.clear();
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		
		
	}
}
