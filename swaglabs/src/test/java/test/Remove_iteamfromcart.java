package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class Remove_iteamfromcart {

WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test(priority=7)
	public void removeiteam() {
		
		//homepage and add iteam to cart function
		 WebElement addToCartButton = driver.findElement(By.cssSelector(".btn_primary"));
	     addToCartButton.click();
	     
		 // Navigate to the cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        
        

        // Remove item from cart
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.id("continue-shopping")).click();

		
        if (driver != null) {
            driver.quit();
        }

		
	}
	
	
	
	
	
}
