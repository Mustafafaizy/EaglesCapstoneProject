package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3playersPageObject extends Base{

	public Mp3playersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]") // Actions class mouse hover method
	private WebElement mp3Players;
	
	
	@FindBy(xpath = "//a[contains(text(),'Show All MP3 Players')]") // click
	private WebElement showAllMp3Players;
	
	
	@FindBy(xpath = "//h2[contains(text(),'MP3 Players')]") // page title must be verified
	private WebElement mp3PlayersPageTitle;
	
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]") // text must be verified
	private WebElement iPodClassic;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]") // click
	private WebElement iPodClassicAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]") // click
	private WebElement iPodClassicAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]") // text must be verified
	private WebElement iPodNano;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]") // Click
	private WebElement iPodNanoAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[2]/i[1]") // Click
	private WebElement iPodNanoAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]") // text must be verified
	private WebElement iPodShuffle;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]") // Click
	private WebElement iPodSuffleAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private WebElement iPodShuffleAddToWishList;
	
	
	@FindBy(partialLinkText = "iPod Tou") // element text must be verified
	private WebElement iPodTouch;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[1]/span[1]") // click
	private WebElement iPodTouchAddToCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[2]/i[1]") // click
	private WebElement iPodTouchAddToWishList;
	
	
	
	
}
