package factorialtest;



import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resusablepackage.BaseTest;

public class Class3DataDriven extends BaseTest{
	 @DataProvider(name = "factorialData")
	    public Object[][] factorialData() {
	        return new Object[][]{
	                {4, 24},
	                {5, 120},
	                {6, 720},
	                {7,5040}
	                
	                
	        };
	 }
	 @Test(dataProvider = "factorialData")
	    public void verifyFactorial(int number, int result) {
	        WebElement input = driver.findElement(By.id("number"));
	        input.clear();
	        input.sendKeys(String.valueOf(number));

	        driver.findElement(By.id("getFactorial")).click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.textMatches(
	                By.id("resultDiv"),
	                Pattern.compile("factorial", Pattern.CASE_INSENSITIVE)
	        ));

	        String actualText = driver.findElement(By.id("resultDiv")).getText().trim();

	     
	        String expectedText = "The factorial of " + number + " is: " + result;

	       
	        System.out.println("Number:   " + number);
	        System.out.println("Expected: " + expectedText);
	        System.out.println("Actual:   " + actualText);
	        System.out.println("--------------------------------------------------");

	        
	        Assert.assertEquals(actualText, expectedText, "❌ Factorial result mismatch for number: " + number);
		        
	 	        
	 	        

	        }
	 }
	        	        
	   
	


