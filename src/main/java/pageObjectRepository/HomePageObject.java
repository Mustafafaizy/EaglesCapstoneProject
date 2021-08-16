package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {

	
	public  HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = " //span[contains(text(),'123456789')]") // is displayed
	private WebElement phoneNumber;
	
	public boolean isPhoneNumberDisplayed() {
		boolean number = WebDriverUtility.isElementDisplayed(phoneNumber);
		return number;
	}
	
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]") // is displayed
	private WebElement myAccount;
	
	public boolean isMyAccountDispalyed() {
		boolean myAccountVerification = WebDriverUtility.isElementDisplayed(myAccount);
		return myAccountVerification;
	}
	
	
	@FindBy(xpath = " //span[contains(text(),'Wish List (0)')]")
	private WebElement wishList;
	
	public boolean isWishListDisplayed() {
		boolean wishListVerification = WebDriverUtility.isElementDisplayed(wishList);
		return wishListVerification;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shopingCart;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkOut;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement testEnvironmentTitle;
	
	@FindBy(xpath = " //a[contains(text(),'MacBook')]") // text must be verified
	private WebElement macBook;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/span[1]")
	private WebElement macAddToCart;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]")
	private WebElement macAddToWidhList;
	
	
	@FindBy(xpath = "//a[contains(text(),'iPhone')]")  // text must be verified
	private WebElement iphone;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]/span[1]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[2]/i[1]")
	private WebElement iphonAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]") // text must be verified
	private WebElement appleCinama;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/button[1]/span[1]")
	private WebElement appleCinemaAddToCart;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/button[2]/i[1]")
	private WebElement appleCinemaAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]") // text must be verified
	private WebElement canon;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[4]/div[1]/div[3]/button[1]/span[1]")
	private WebElement canonAddToCart;
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[4]/div[1]/div[3]/button[2]/i[1]")
	private WebElement canonAddToWishList;
	
	
	@FindBy(xpath = "//h5[contains(text(),'Information')]") // text must be verified
	private WebElement information;
	
	
	@FindBy(xpath = "//h5[contains(text(),'Customer Service')]") // text must be verified
	private WebElement customerService;
	
	
	@FindBy(xpath = "//h5[contains(text(),'Extras')]") // text must be verified
	private WebElement extra;
	
	
	@FindBy(xpath = "//h5[contains(text(),'My Account')]") // text must be verified
	private WebElement myAcoountLink;
	
	
	
	
	
	
	
	
	
	
	
}
