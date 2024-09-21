package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class Checkadded_product {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=6)
	public void test6() {
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		
		 // Check if the item is added to the cart
	    WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	    cartBadge.click();
	    
	    
		// to close the windows
	    if (driver != null) {
            driver.quit();
        }

	}
	
	
	
	
	
}
	
	
	

