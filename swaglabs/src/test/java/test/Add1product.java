package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Add1product {

	
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=5)
	public void test5() {
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//homepage and add iteam to cart function
		 WebElement addToCartButton = driver.findElement(By.cssSelector(".btn_primary"));
	     addToCartButton.click();
	     
	     // To close the window
	     if (driver != null) {
	            driver.quit();
	        }

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
