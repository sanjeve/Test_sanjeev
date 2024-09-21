package test;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Checkout {
WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test(priority=10)
	public void checkout() {
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	       driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		
		
		//check out page
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("tt");
        driver.findElement(By.id("postal-code")).sendKeys("622156");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        
        
        
        if (driver != null) {
            driver.quit();
        }
		
	}
	
	
}
