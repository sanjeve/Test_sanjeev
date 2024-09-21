package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

@Test
public class Wrongcred3 {

WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeclass() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=3)
	public void testWrongUserWithCorrectPassword() {
        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));
        
        // Perform login with wrong co
        driver.findElement(By.id("user-name")).sendKeys("Test");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	
     // Wait and verify error message or incorrect URL
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")));
        AssertJUnit.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/"));
        
        // Cleanup
        if (driver != null) {
            driver.quit();
        }

	
	}
	
	
	
	
	
	
	
	
}
