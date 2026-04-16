package classes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReusableMethod;

public class Class2ImageLinkCount extends BaseTest {
	 @Test
	    public void verifyImagesAndLinks() {
	        ReusableMethod reusable = new ReusableMethod(driver);

	        int totalImages = reusable.countElements(By.tagName("img"));
	        int totalLinks = reusable.countElements(By.tagName("a"));

	        System.out.println("Total Images: " + totalImages);
	        System.out.println("Total Links: " + totalLinks);

	        Assert.assertTrue(totalImages > 0, "No images found on homepage");
	        Assert.assertTrue(totalLinks > 0, "No links found on homepage");
	    }

}
