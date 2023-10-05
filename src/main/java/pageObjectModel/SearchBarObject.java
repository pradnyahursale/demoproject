package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarObject {
	
	public static WebDriver driver;
	
	private By SB=By.xpath("//input[@id='twotabsearchtextbox']");
	
	private By SBT=By.xpath("//input[@id='nav-search-submit-button']");
	
	private By IphoneG=By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	
	//private By ADC=By.xpath("//input[@name='submit.add-to-cart']");
	
	private By BYN=By.xpath("/html/body/div[4]/div[2]/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[36]/div/div/span/span/input");
	
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
		return driver.findElement(IphoneG);
		
	}
	
	public WebElement clickonbuynow()
	{
		return driver.findElement(BYN);
		
		
	}
	
		
	

}
