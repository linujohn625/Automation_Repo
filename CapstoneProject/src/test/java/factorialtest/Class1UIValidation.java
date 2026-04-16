package factorialtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import resusablepackage.BaseTest;
import resusablepackage.ReusableMethods;

public class Class1UIValidation extends BaseTest{
	
	@Test
	public void ValidateUIElements(){
		    WebElement textbox = driver.findElement(By.id("number"));
	        WebElement calcBtn = driver.findElement(By.id("getFactorial"));
	        WebElement about = driver.findElement(By.xpath("//*[text()='About']"));
	        WebElement termscndtn = driver.findElement(By.xpath("//*[text()='Terms and Conditions']"));
	        WebElement privacy = driver.findElement(By.xpath("//*[text()='Privacy']"));
   
	        Assert.assertTrue(ReusableMethods.isElementClickable(textbox), "Textbox not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(calcBtn), "Calculate button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(about), "about button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(termscndtn), "terms button not clickable");
	        Assert.assertTrue(ReusableMethods.isElementClickable(privacy), "privacy button not clickable");
	     
	}
	

	}


