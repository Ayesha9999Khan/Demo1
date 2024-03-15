package selectClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement dropdwn = driver.findElement(By.xpath("//select[@id='cars']"));
	Select sc = new Select(dropdwn);
	Thread.sleep(2000);
	
	sc.selectByIndex(0);
	Thread.sleep(2000);
	
	sc.selectByValue("saab");
	Thread.sleep(2000);
	
	sc.selectByVisibleText("Audi");
	Thread.sleep(2000);
	
	
	
}
}
