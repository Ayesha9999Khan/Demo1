package screenshot;
//timestamp, string
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Program3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		Date d = new Date();
//		String timestamp=d.toString().replace(' ', '_').replace(':', '_');
		
		String as=RandomString.make(2);

		File dest = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\ScreenshotFolder\\"+as+"jpg");
		FileHandler.copy(src, dest);
		
		
		
		
		
	}
}
