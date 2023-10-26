package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HamburgerMenuObject {
	
	public static WebDriver driver;
	
	private By HMB=By.xpath("//a[@id='nav-hamburger-menu']");
	
	private By elec=By.xpath("(//a[@class='hmenu-item'])[4]");
	
	private By CPA=By.xpath("/html/body/div[3]/div[2]/div/ul[33]/li[6]/a");
	
	private By PN=By.xpath("//h1[@id='title']");
	
	private By location=By.xpath("//a[@id='nav-global-location-popover-link']");
	
	private By country=By.xpath("//select[@id='GLUXCountryList']");
	
	private By done=By.xpath("//button[@name='glowDoneButton']");
	
	public HamburgerMenuObject(WebDriver driver2) {
		HamburgerMenuObject.driver=driver2;
	}

	public WebElement clickonhambmenu()
	{
		return driver.findElement(HMB);
	}
	
	public WebElement selectelectronic()
	{
		return driver.findElement(elec);
	}
	
	public WebElement selectCellphoneAccessories()
	{
		return driver.findElement(CPA);
	}
	
	public WebElement getProductTitle()
	{
		return driver.findElement(PN);
	}
	
	public WebElement selectLoction()
	{
		return driver.findElement(location);
	}
	
	public WebElement selectCountry()
	{
		return driver.findElement(country);
	}
	
	public WebElement clickonDone()
	{
		return driver.findElement(done);
	}
	
	

	

}
