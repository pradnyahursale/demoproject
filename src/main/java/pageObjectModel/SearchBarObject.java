
package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarObject {
	
	public static WebDriver driver;
	
	private By SB=By.xpath("//input[@id='twotabsearchtextbox']");
	
	private By SBT=By.xpath("//input[@id='nav-search-submit-button']");
	
	private By Iphone14=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	
	private By ADC=By.xpath("//input[@title='Add to Shopping Cart']");
	
	public SearchBarObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement entervalues()
	{
		return driver.findElement(SB);
	}
	
	public WebElement clickonsubmitbutton()
	{
		return driver.findElement(SBT);
		
	}
	
	public WebElement selectmodel()
	{
		return driver.findElement(Iphone14);
		
	}
	
	public WebElement clickonAddtocart()
	{
		return driver.findElement(ADC);
		
		
	}
	
		
	

}
