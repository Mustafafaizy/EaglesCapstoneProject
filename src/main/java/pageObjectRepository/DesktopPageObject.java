package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopPageObject extends Base{
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Desktops']") // mouse hover on this web element.
	private WebElement desktop;
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Desktops')]") // page title must verified'
	private WebElement desktopPageTitle;
	
	
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]") // text must be verified
	private WebElement hp;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement hpAddTpCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement hpAddToWishList;
	@FindBy(id = "input-quantity")
	private WebElement hpLpQuantity;
	@FindBy(id = "button-cart")
	private WebElement hPLpQuantityAddToCart;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement hpLPSucceessMsg;
	
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]") // text must be verified
	private WebElement htcPhone;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement htcPhonAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement htcPhonAddToWishList;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]") // text must be verified
	private WebElement ipodClassic;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[6]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement ipodClassicAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[6]/div[1]/div[2]/div[2]/button[2]")
	private WebElement ipodClassicAdToWishlist;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]") // text must be verified
	private WebElement macBookAir;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[8]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement macBookAirAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[8]/div[1]/div[2]/div[2]/button[2]")
	private WebElement macBookAirAddToWishList;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Product 8')]") // text must be verified
	private WebElement product8;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[10]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement product8AddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[10]/div[1]/div[2]/div[2]/button[2]")
	private WebElement product8AddToWishList;
	
	
	@FindBy(linkText = "Samsung SyncMaster 941BW") // text must be verified
	private WebElement samsungSyncMaster;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[11]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement samsungSyncMasterAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[11]/div[1]/div[2]/div[2]/button[2]")
	private WebElement samsunSyncMasterAddToWishList;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]") // text must be verified
	private WebElement sonyVaio;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[12]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement sonyVaioAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[12]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyVaioAddToWishLiat;
	
	
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]") // Canon EOS 5D Add to cart
	private WebElement canonEos5DAddToCart;
	@FindBy(id = "input-option226")  // selecting color
	private WebElement canonColorSelecttion;
	@FindBy(id = "input-quantity") // selecting the quantity
	private WebElement canonQuantity;
	@FindBy(id = "button-cart") // add to cart 
	private WebElement canonAddToCart;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]") // success mesg
	private WebElement canonSuccsessMsg;
	
	//Canon EOS5D review section
	
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement reviewLink;
	@FindBy(id = "input-name")
	private WebElement yourNameFiled;
	@FindBy(id = "input-review")
	private WebElement yourReviewFiled;
	@FindBy(xpath = "//input[@value='5']")
	private WebElement goodRadioButton;
	@FindBy(id = "button-review")
	private WebElement reviewContinueButton;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement submitReviewMessg;
	
	
	
	public void desktopMouseHover() {
		Actions action = new Actions(driver);
		 action.moveToElement(desktop).build().perform();
	}
	
	
	public void showAllDesktopTab() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}
	
	
	
	public void deskTopPageTitleVerifecation() {
		boolean pageTtile = desktopPageTitle.isDisplayed();
		System.out.println(pageTtile);
	}
	
	
	
	public void hpLp3065AddToCart() {
		WebDriverUtility.clickOnElement(hpAddTpCart);
	}
	
	
	
	public void hpLP3065Quantity(String numberOfQuantity) {
		hpLpQuantity.clear();
		hpLpQuantity.sendKeys(numberOfQuantity);
	}
	
	
	
	public void hpLPafterQuntityAddToCart() {
		WebDriverUtility.clickOnElement(hPLpQuantityAddToCart);
	}
	
	
	public void successMsge() {
		boolean mesg = hpLPSucceessMsg.isDisplayed();
		System.out.println(mesg);
	}
	
	
	
	// Canon EOS 5D
	
	public void addToCartButton() {
		WebDriverUtility.clickOnElement(canonEos5DAddToCart);
	}
	
	
	
	public void selectingColor() {
		Select select = new Select(canonColorSelecttion);
		select.selectByVisibleText("Red");
	}
	
	
	public void addingTheQuantity(String numberOFCanonCamera) {
		canonQuantity.clear();
		canonQuantity.sendKeys(numberOFCanonCamera);
	}
	
	
	
	public void addingItemToCart() {
		WebDriverUtility.clickOnElement(canonAddToCart);
	}
	
	
	
	public String itemAddedSuccessMsg() {
		String message = canonSuccsessMsg.getText();
		return message;
	}
	
	
	// review webElements
	public void clickOnreviewLink() {
		WebDriverUtility.clickOnElement(reviewLink);
		
	}
	
	
	
	public void sendingValueToYourNameField(String yourName) {
		yourNameFiled.sendKeys(yourName);
	}
	
	
	public void sendingValueToYourReviewField(String yourReview) {
		yourReviewFiled.sendKeys(yourReview);
	}
	
	
	public void selectingRadioButton(String rating) {
		if(rating.equalsIgnoreCase("Good")) {
			if(!goodRadioButton.isSelected())
			WebDriverUtility.clickOnElement(goodRadioButton);
		}
			
	}
	
	
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(reviewContinueButton);
	}
	
	
	
	public String reviewSucceesMsg() {
		String messge = reviewContinueButton.getText();
		return messge;
	}
	
	
	
	
	
	
	
	
	
	
	
}
