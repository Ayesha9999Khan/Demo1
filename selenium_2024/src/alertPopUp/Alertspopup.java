package alertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspopup {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	

	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	Thread.sleep(2000);
	alt .accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
