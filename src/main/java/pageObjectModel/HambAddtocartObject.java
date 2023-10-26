package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HambAddtocartObject {
	
	public static WebDriver driver;
	
	private By ADC=By.xpath("//input[@id='add-to-cart-button']");
	
	private By checkout=By.xpath("//input[@name='proceedToRetailCheckout']");
	
	public HambAddtocartObject(WebDriver driver2) {
		this.driver=driver2;
	}

    public WebElement clickonADC()
	{
		return driver.findElement(ADC);
	}
    
    public WebElement clickonCheckout()
    {
    	return driver.findElement(checkout);
    }
	
	

}
