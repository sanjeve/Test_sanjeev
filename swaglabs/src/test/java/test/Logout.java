package test;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Logout {

	public class Checkout {
		WebDriver driver = new ChromeDriver();
			
			@BeforeTest
			public void beforeclass() {
				driver.get("https://www.saucedemo.com/");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
		        driver.findElement(By.id("password")).sendKeys("secret_sauce");
		        driver.findElement(By.id("login-button")).click();
				
			}
@Test(priority=11)
public void logout() {
	
	 //logout
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
    menuButton.click();
    
    WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

   // WebElement logoutButton = driver.findElement(By.className("bm-item menu-item"));
    logoutButton.click();
//    Assert.assertTrue("logoutsuccessfull", false);
    
}
	@AfterTest
	public void teardown() {
		if (driver != null) {
            driver.quit();
        }
		
	}
	
	
	
	
			
}
}