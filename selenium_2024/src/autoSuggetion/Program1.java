package autoSuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Samsung");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='eIPGRd']/div[2]/div[1]/div[1]/span"));
		System.out.println(list.size());
		
		for(WebElement auto:list) {
			System.out.println(auto.getText());
		}

		String exp= "samsung s23";
		for(WebElement auto:list) {
			
			String act=auto.getText();
			if(exp.equals(act))
				
			auto.click();
			break;
		}
		
		
		
		
		
		
	}
}
