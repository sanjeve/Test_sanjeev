package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

@Test
public class Correctcred {

WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=4)
	 public void testCorrectCredentials() {
        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        // Perform login with correct credentials
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        // Wait for the user to be redirected to the product page
        wait.until(ExpectedConditions.urlContains("/inventory.html"));
        String currentUrl = driver.getCurrentUrl();
        AssertJUnit.assertTrue("The URL does not contain '/inventory.html'", currentUrl.contains("/inventory.html"));	
			
        if (driver != null) {
            driver.quit();
        }
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
