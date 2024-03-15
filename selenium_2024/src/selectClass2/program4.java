package selectClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement color = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select sc=new Select(color);
		Thread.sleep(2000);
		
		WebElement fisrt = sc.getFirstSelectedOption();
		System.out.println(fisrt.getText());
		
		
		
		
		
		
		
		
		
		
	}
}
