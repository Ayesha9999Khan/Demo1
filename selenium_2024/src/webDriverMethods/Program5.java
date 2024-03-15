package webDriverMethods;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/a[2]")).click();      //mobile icon click
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");       //search bar 
		 Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();        //click search icon
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]")).click();      //click product link
         Thread.sleep(2000);
        Set<String> clicks = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(clicks);
		Thread.sleep(2000);
		
		
		 driver.switchTo().window(al.get(1));
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();   //click add to cart
		 Thread.sleep(2000);
		
		
	}
}
