package classes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReusableMethod;

public class Class1UIValidation extends BaseTest{
	@Test
    public void validateUIElements() {
        ReusableMethod reusable = new ReusableMethod(driver);
        Assert.assertTrue(reusable.isDisplayed(By.xpath("//button[text()='Login']")), "Login button not clickable");
        Assert.assertTrue(reusable.isDisplayed(By.xpath("//button[text()='Register']")), "Register button not clickable");
        Assert.assertTrue(reusable.isDisplayed(By.xpath("//input[@placeholder='Search for items/categories']")), "Search textbox not clickable");
    }

}
           