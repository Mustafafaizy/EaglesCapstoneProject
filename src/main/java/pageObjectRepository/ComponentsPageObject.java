package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{

	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]") // mouse hover action on this web element
	private WebElement components;
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]") // click on the element
	private WebElement showAllComponents;
	
	@FindBy(xpath = "//h2[contains(text(),'Components')]") // page title must be verified
	private WebElement copmponentsPageTitle;
	
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]") // click on this element
	private WebElement monitors;
	
	@FindBy(xpath = "//h2[contains(text(),'Monitors')]") // monitors page title must be verified
	private WebElement monitorsPageTitle;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
