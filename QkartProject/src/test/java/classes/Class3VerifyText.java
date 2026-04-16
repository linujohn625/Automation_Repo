package classes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReusableMethod;

public class Class3VerifyText extends BaseTest  {
	 @Test
	    public void verifyTextAndURL() {
	        ReusableMethod reusable = new ReusableMethod(driver);

	        String placeholder = reusable.getAttribute(By.xpath("//input[@placeholder='Search for items/categories']"), "placeholder");
	        Assert.assertEquals(placeholder, "Search for items/categories", "Search textbox placeholder mismatch");

	        String title = driver.getTitle();
	        Assert.assertEquals(title, "QKart", "Page title mismatch");

	        String url = driver.getCurrentUrl();
	        Assert.assertTrue(url.startsWith("https"), "URL does not contain HTTPS");
	    }

}
