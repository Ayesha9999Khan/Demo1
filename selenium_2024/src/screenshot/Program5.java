package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Program5 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    File desti = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\ScreenshotFolder\\shot.jpg");
		
	    FileHandler.copy(scr, desti);
	    
		
		
		
		
		
}
}
