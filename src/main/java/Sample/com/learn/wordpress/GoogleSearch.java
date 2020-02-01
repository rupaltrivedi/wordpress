package Sample.com.learn.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GoogleSearch 
{
   public static WebDriver driver;
 
   
	 By searchBox= By.id("fakebox-input");
	 By searchButton= By.name("btnK");
   
   public GoogleSearch(WebDriver driver) {
	   this.driver=driver;
   }
   
   public void setText(String searchText) {
	   
	    driver.findElement(searchBox).sendKeys(searchText);;
	   
   }
   
   public void clickSearchButton() {
	   driver.findElement(searchButton).sendKeys(Keys.RETURN);;
	   
   }
   
   
   
   
}
