package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class laptopsNoteBooksTestStepDef extends Base {

	LaptopsNoteBooksPageObject laptopsNoteBooks = new LaptopsNoteBooksPageObject();
	
	

	@Given("^User is on retail website$")
	public void user_is_on_retail_website() {
		openBrowser();
		logger.info("User is on retail website");
	}
	
	

	@When("^User hover the mosue on laptop and notebook tab$")
	public void user_hover_the_mosue_on_laptop_and_notebook_tab() {
		laptopsNoteBooks.mouseHoverOnLaptopAndNotepads();
		logger.info("User hovered mouse on laptop and notebook tab");
		WebDriverUtility.screenShot();
	}
	
	

	@When("^User clicks on ahow all laptop and notebook option$")
	public void user_clicks_on_ahow_all_laptop_and_notebook_option() {
		laptopsNoteBooks.showAllLaptopsAndNotepads();
		logger.info("User clicked on show all laptop and notebook option");
		
	}
	
	

	@When("^User clicks on macbook$")
	public void user_clicks_on_macbook() {
		laptopsNoteBooks.clickOnMacpro();
		logger.info("User clicked on macbook");
	}
	
	
//	@When("^User clicks add to cart button$")
//	public void user_clicks_add_to_cart_button() {
//		laptopsNoteBooks.clickOnAddToCart();
//		
//	}
	

	@Then("^User should see a Message 'Success: You have added MacBook to your shoping cart!'$")
	public void user_should_see_a_Message_Success_You_have_added_MacBook_to_your_shoping_cart() {
		laptopsNoteBooks.successMsgVerification();
	}
	
	

	@Then("^User should see one item added to the cart$")
	public void user_should_see_one_item_added_to_the_cart() {
	}
	
	

	@Then("^User clicks on cart option$")
	public void user_clicks_on_cart_option() {
	}
	
	

	@Then("^User clicks on red X button to remove the item from cart$")
	public void user_clicks_on_red_X_button_to_remove_the_item_from_cart() {
		
	}
	
	

	@Then("^Item should be removed and cart shows (\\d+) item$")
	public void item_should_be_removed_and_cart_shows_item() {
		
	}
	
}


