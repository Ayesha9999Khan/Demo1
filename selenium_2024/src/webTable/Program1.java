package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium_2024\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
    List<WebElement> table = driver.findElements(By.xpath("//tbody/tr/td[5]"));
    System.out.println("india population growth in %");
    for(WebElement web:table) {
	System.out.println(web.getText());
}
    Thread.sleep(2000);



}
}
