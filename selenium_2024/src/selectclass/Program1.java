package selectclass;
//select class---- select method---select by Index,Value,VisibleText
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s = new Select(month);
	Thread.sleep(2000);
	
//feb-may-sep
	
	s.selectByIndex(1);
	Thread.sleep(2000);
	
	s.selectByValue("5");
	Thread.sleep(2000);
	
	s.selectByVisibleText("Sep");
	Thread.sleep(2000);
	
	//driver.close();
	
}
}
