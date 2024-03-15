package xpath;
//attribute , text ,contains , index

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    	
	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kicthen king");    //attribute
		
		
	    WebElement text = driver.findElement(By.xpath("//div[text()='Up to 60% off | Styles for men']"));    //text
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("(//h2[contains(@class,'a-color-base headline')])[1]"));           //contains
		
		
		driver.findElement(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[1]"));        //index
		
		
		
	}
}
