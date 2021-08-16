package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CamerasPageObject extends Base{
	
	
	public CamerasPageObject() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]") // Actions class mouse hover method
	private WebElement cameras;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Cameras')]") // click
	private WebElement ShowAllCameras;
	
	
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]") // web Element text must be verified
	private WebElement canonEos5D;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")// clicks
	private WebElement canonEos5DAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private WebElement canonEos5DAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Nikon D300')]") //web element text must be verified
	private WebElement nikonD300;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]") // click
	private WebElement nikonD300AddTOCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private  WebElement nikond300AddToWishList;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
