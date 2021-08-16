package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{

	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Software')]") // click
	private WebElement softWare;
	
	@FindBy(xpath = "//h2[contains(text(),'Software')]") // page title must be verifieds
	private WebElement softwarePageTitle;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
