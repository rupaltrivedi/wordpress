package Sample.com.learn.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing{
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
public static void googleSearchTest() {
	String projectPath= System.getProperty("user.dir");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	driver= new ChromeDriver();
	
	GoogleSearch gs= new GoogleSearch(driver);
	System.out.println("Working....");
	driver.get("https://www.google.com");
	
	System.out.println("Working1....");
	
	
	gs.setText("wordpress login");
	System.out.println("Working2....");
	gs.clickSearchButton();
	
}
	
	
	
}

