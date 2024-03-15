package selectclass;
//isMultiple, getOpetion, getAllselectedopetion, getFirstSelectedOpetion
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement colorlist = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select sc = new Select(colorlist);
	
	Thread.sleep(2000);
	
//	sc.selectByValue("3");
//	Thread.sleep(2000);
	
//	boolean list = sc.isMultiple();
//	System.out.println(list);
	
	
	
//	List<WebElement> optins = sc.getOptions();
//	for(WebElement listall:optins) {
//		System.out.println(listall.getText());
//	}
//	
//	
//	List<WebElement> getselctop = sc.getAllSelectedOptions();
//	for(WebElement getlist:getselctop) {
//		System.out.println(getlist.getText());
//	}
	
	WebElement frstoptn = sc.getFirstSelectedOption();
	System.out.println("get first selected opetion "+frstoptn.getText());
}
}
