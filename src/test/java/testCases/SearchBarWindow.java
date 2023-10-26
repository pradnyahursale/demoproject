package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.SearchBarObject;
import resources.Baseclass;

public class SearchBarWindow extends Baseclass {
	
	@Test
	public void searchbar() throws IOException, InterruptedException
	{
		initializedriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		SearchBarObject sbo=new SearchBarObject(driver);
		
		sbo.entervalues().sendKeys("Iphone 14");
		
		Thread.sleep(1000);
		
		sbo.clickonsubmitbutton().click();
		
		Thread.sleep(1000);
		
		sbo.selectmodel().click();
		
		Thread.sleep(1000);
		
		sbo.clickonAddtocart().click();
			
		
	}

}
