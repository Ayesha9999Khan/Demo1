package multiplewindowHandle2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsung");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
	Thread.sleep(2000);
	Set<String> ss = driver.getWindowHandles();
    ArrayList<String> al = new ArrayList<String>(ss);
	Thread.sleep(2000);
	
    driver.switchTo().window(al.get(1));
    Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().window(al.get(1));
	driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[2]")).click();
	Thread.sleep(2000);
	
	driver.switchTo().window(al.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	
}
}
