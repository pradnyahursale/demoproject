package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.HambProdObject;
import pageObjectModel.HamburgerMenuObject;
import resources.Baseclass;

public class GetProd extends Baseclass{
	
	@Test
	public void getprod1() throws IOException, InterruptedException
	{
        initializedriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		HamburgerMenuObject hmo=new HamburgerMenuObject(driver);
		
		hmo.clickonhambmenu().click();
		
		Thread.sleep(2000);
		
		hmo.selectelectronic().click();
		
		Thread.sleep(2000);
		
		hmo.selectCellphoneAccessories().click();
		
		Thread.sleep(2000);
		
        hmo.selectLoction().click();
		
		Thread.sleep(2000);
		
		hmo.selectCountry();
		
		Select s=new Select(hmo.selectCountry());
		
		s.selectByVisibleText("Australia");
		
		Thread.sleep(1000);
		
		hmo.clickonDone().click();
		
		Thread.sleep(2000);
		
		HambProdObject hpo=new HambProdObject(driver);
		
		hpo.selectprod1().click();
		
		Thread.sleep(2000);
		
		System.out.println(hpo.getTitle().getText());
		
		Thread.sleep(2000);
		
		System.out.println(hpo.getprice().getText());
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	
			
	

}

	
	


