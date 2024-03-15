package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	Thread.sleep(2000);
	//driver.switchTo().frame(1);
	driver.switchTo().frame("singleframe");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ayesha");
	
	
}
}
