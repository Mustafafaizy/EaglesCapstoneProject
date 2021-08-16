package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base{
	
	
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")  // mouse hover on this web element
	private WebElement laptopsAndNoteBooks;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]") // click in this element
	private WebElement showAllLaptopsAndnoteBooks;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")  // page title must be verified
	private WebElement laptopsAndNoteBooksPageTitle;
	
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/i[1]") //!if select then select it( if its not selected click on it)
	private WebElement sortByList;
	
	@FindBy(id = "input-sort") // its static drop down. Select class is needed to select value from drop down using its methods
	private WebElement sortByDropDown;
	
	@FindBy(id = "input-limit") // its static drop down. Select class is needed to select value from drop down using its methods
	private WebElement showDropDown;
	
	
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]") // text must be verified
	private WebElement hpLp;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement hpLpAddTOCart;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement hpLpAddToWishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]") // text must be verified
	private WebElement macBookPro;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement macBookProAddToCart;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartVerificarion;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement removingItemFromCart;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement macBookProAddToWishList;
	
	
	
	public void mouseHoverOnLaptopAndNotepads() {
		Actions action = new Actions(driver);
		
		action.moveToElement(laptopsAndNoteBooks).build().perform();
	}
	
	
	
	public void showAllLaptopsAndNotepads() {
		showAllLaptopsAndnoteBooks.click();
	}
	
	
	public void clickOnMacpro() {
		macBookPro.click();
	}
	
	
	public void clickOnAddToCart() {
		macBookProAddToCart.click();
	}
	
	
	
	
	public void successMsgVerification() {
		successMsg.isDisplayed();
	}
	
	
	public void itemShowsInCartVerifivation() {
		cartVerificarion.isDisplayed();
	}
	
	
	public void userClicksOnCartOption() {
		cartVerificarion.click();
	}
	
	
	
	public void UserRemoveItemFromCart() {
		removingItemFromCart.click();
	}

	
	
	
	
	
	
}
