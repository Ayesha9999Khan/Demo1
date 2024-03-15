package selectClass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement all = driver.findElement(By.xpath("//select[@id='oldSelectMenu']/option"));
		Select sc=new Select(all);
		Thread.sleep(2000);
		
		
		List<WebElement> allselcted = sc.getOptions();
		for(WebElement temp:allselcted) {
			System.out.println(temp.getText());
		}
		
		
		Thread.sleep(2000);
		System.out.println("*****************");
		
		
		List<WebElement> selct = sc.getAllSelectedOptions();
		for(WebElement getall:selct) {
			System.out.println(getall.getText());
		}
		
		
		
		
		
		
	}
}
