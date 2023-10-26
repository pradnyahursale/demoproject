package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HambProdObject {
	
	public static WebDriver driver;
	
	private By prod1=By.xpath("//div[@data-index='5']");
	
	private By getTitle=By.xpath("//span[@id='productTitle']");
	
	private By getPrice=By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']");
	
	public HambProdObject(WebDriver driver2) {
	this.driver=driver2;
	}


	public WebElement selectprod1()
	{
		return driver.findElement(prod1);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(getTitle);
	}
	
	public WebElement getprice()
	{
		return driver.findElement(getPrice);
	}
	
	

}
