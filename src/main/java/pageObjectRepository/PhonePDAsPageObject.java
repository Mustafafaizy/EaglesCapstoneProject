package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonePDAsPageObject extends Base{

	public PhonePDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]") // click
	private WebElement phonePDAs;
	
	@FindBy(xpath = "//h2[contains(text(),'Phones & PDAs')]") // page title must be verified
	private WebElement phondPDAsPageTitle;
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]") // text must be verified
	private WebElement htcTouchHd;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]") //click
	private WebElement htcTouchHdAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private WebElement htcTouchHdAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]") // web element text
	private WebElement palmTreoPro;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]") // click
	private WebElement palmTreoProAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private WebElement palmTreoProAddToWishList;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

