package xpath;
//following and preceding sibling

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> text = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[2]/following-sibling::div"));        //following-sibling
		for(WebElement list:text) {
			System.out.println(list.getText());
		}
		
		System.out.println("*******************************");
		
		List<WebElement> text1 = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[2]/preceding-sibling::div"));             //preceding-sibling
		for(WebElement listof:text1) {
			System.out.println(listof.getText());
		}
		
		
		
		
		
		
		
		
		
}
}
