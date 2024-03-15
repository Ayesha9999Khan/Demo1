package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Program4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement element = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		File src = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		String as1=RandomString.make(5);
		
		File dest = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\ScreenshotFolder\\"+as1+"jpg");
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
	}
}
