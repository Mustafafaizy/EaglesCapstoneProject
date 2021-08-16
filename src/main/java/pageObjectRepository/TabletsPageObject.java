package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{
	
	public TabletsPageObject() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]") // we need to click on this element
	private WebElement tablets;
	
	@FindBy(xpath = "//h2[contains(text(),'Tablets')]")  // page title must be verified
	private WebElement tabletsPageTitle;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]") // element text must be verified
	private WebElement samsungGalaxyTab;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement samsungGalaxyTabAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement samsungGalaxyTabAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]") // we need to click on this element
	private WebElement contactUs;
	
	@FindBy(xpath ="//h1[contains(text(),'Contact Us')]") // page title must be verified
	 private WebElement contactUsPageTiltle;
	
	
	@FindBy(id = "input-name") // name value must be sent to this field
	private WebElement yourName;
	@FindBy(id = "input-email") // email value must be sent to this field
	private WebElement email;
	@FindBy(id = "input-enquiry")  //message need be send to this field
	private WebElement enquiryMasg;
	
	@FindBy(xpath = "//body/div[@id='information-contact']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]") // click
	private WebElement submitButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
