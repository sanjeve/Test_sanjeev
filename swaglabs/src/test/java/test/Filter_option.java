package test;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Filter_option {

	@Test
	public class Correctcred {

		WebDriver driver = new ChromeDriver();
			
			@BeforeTest
			public void beforeclass() {
				driver.get("https://www.saucedemo.com/");
				System.out.println("Git Test");
			}
			
public void CorrectCredentials() {
        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        
        // Perform login with correct credentials
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
}
	
        @Test(priority=9)  
        public void filteroption() {
            // Test filtering function
            WebElement filterButton = driver.findElement(By.className("product_sort_container"));
            filterButton.click();

            // Select the "Price (low to high)" filter
            WebElement filterOption = driver.findElement(By.xpath("//option[@value='lohi']"));
            filterOption.click();

            // Verify that the filter is applied
            WebElement firstProductPrice = driver.findElement(By.cssSelector(".inventory_item_price"));
            // Get the text of the price and check if it starts with "$7.99" (example for the lowest price)
            String firstProductPriceText = firstProductPrice.getText();
           System.out.println(firstProductPriceText);

           
         
   	        if (driver != null) {
   	            driver.quit();
   	        
   	    
        
      }
        }
	}
	
}



	



