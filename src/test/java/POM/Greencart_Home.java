package POM;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.Allxpaths;


public class Greencart_Home extends Allxpaths {
	
	
	public static WebDriver search_box(String s) throws Throwable
	{
		driver.findElement(By.xpath(Allxpaths.searchBox)).sendKeys(s);;
		Thread.sleep(2000);
		return driver;
	}
	
	public static WebDriver ValidateAdded_product(String s) throws Throwable
	{
		String e =(driver.findElement(By.cssSelector(Allxpaths.Validate_VegiName)).getText());
		assertTrue(e.contains(s));
		Thread.sleep(1000);
		return driver;
	}
	

}
