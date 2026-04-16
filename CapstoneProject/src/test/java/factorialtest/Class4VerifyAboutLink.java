package factorialtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import resusablepackage.BaseTest;

public class Class4VerifyAboutLink extends BaseTest{
	@Test
	public void verifylinks(){
		driver.findElement(By.linkText("About")).click();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		int linkcount=alllinks.size();
		Assert.assertTrue(linkcount > 5, "Lessthan 5 links found in the ABOUT Page");
		System.out.println("Total count of Links are:"+linkcount);
		for(WebElement link:alllinks) {
			System.out.println(link.getText());
		}
	
		
	}
	
 
}
