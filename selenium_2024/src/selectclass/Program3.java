package selectclass;
//Dselect opetion
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//select class		
		WebElement carlist = driver.findElement(By.xpath("//select[@id='cars']"));
		Select sc = new Select(carlist);
		Thread.sleep(2000);
		
//select opetions		
		sc.selectByIndex(2);
		Thread.sleep(2000);
		
		sc.selectByValue("audi");
		Thread.sleep(2000);
		
		sc.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
//Dselect opetions
		    
		sc.deselectByIndex(2);
		Thread.sleep(2000);
		
		sc.deselectByValue("audi");
		Thread.sleep(2000);
		
		sc.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		 sc.deselectAll();
		 Thread.sleep(2000);
		
	}

}