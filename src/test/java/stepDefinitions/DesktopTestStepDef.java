package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopPageObject;
import utilites.WebDriverUtility;

public class DesktopTestStepDef extends Base {

	DesktopPageObject desktop = new DesktopPageObject();

	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		openBrowser();
		logger.info("User is on Reatil Website homePage");
		WebDriverUtility.screenShot();
	}

	@When("^User clicks on desktop tab$")
	public void user_clicks_on_desktop_tab() {
		desktop.desktopMouseHover();
		logger.info("user hoverd mouse over desktop dropdwon");
	}

	@When("^User clicks on show all desktop$")
	public void user_clicks_on_show_all_desktop() {
		desktop.showAllDesktopTab();
		logger.info("User were able to click on all desktop tab dropdown");
	}

	@Then("^User should see all items present in desktop page$")
	public void user_should_see_all_items_present_in_desktop_page() {
		desktop.deskTopPageTitleVerifecation();
		logger.info("User is on Desktop home page");
		WebDriverUtility.screenShot();
	}

	@When("^User clicks Add To Cart option on HpLP3065 item$")
	public void user_clicks_Add_To_Cart_option_on_HpLP_item() {
		desktop.hpLp3065AddToCart();
		logger.info("user clicked on add to cart button");
	}

	@When("^User Select quantity '1'$")
	public void user_Select_quantity() {
		desktop.hpLP3065Quantity("1");
		logger.info("User selected the desired quantity");
		WebDriverUtility.screenShot();
	}

	@When("^User clicks add to cart button$")
	public void user_clicks_add_to_cart_button() {
		desktop.hpLPafterQuntityAddToCart();
		logger.info("User added item to the cart after selecting the quantity");
	}

	@Then("^User should see a message Succees you have added HPLP3065 to your shoping cart$")
	public void user_should_see_a_message_Succees_you_have_added_HP_LP_to_your_shoping_cart() {
		desktop.successMsge();
		logger.info("The success msg appeared");
		WebDriverUtility.screenShot();
	}

	// Canon EOS 5D

	@When("^User clicks on Add to cart option on Canon EOS5D$")
	public void user_clicks_on_Add_to_cart_option_on_Canon_EOS_D() {
		desktop.addToCartButton();
		logger.info("user clicked on add to cart option");
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red() {
		desktop.selectingColor();
		logger.info("User selected the desired color");
	}

	@When("^User select quantity '1'$")
	public void user_select_quantity() {
		desktop.addingTheQuantity("1");
		logger.info("User added the desired quantity");
		WebDriverUtility.screenShot();
	}

	@When("^User click on add to cart button$")
	public void user_click_on_add_to_cart_button() {
		desktop.addingItemToCart();
		logger.info("User added the item to the Shping cart");
	}

	@Then("^User should see a message You have added Canon EOS5D to your shoping cart$")
	public void user_should_see_a_message_You_have_added_Canon_EOS_D_to_your_shoping_cart() {
		desktop.itemAddedSuccessMsg();
		logger.info("Itemd added successfully");
		WebDriverUtility.screenShot();
	}

	
	
	
	@When("^User clicks on write a Review Link$")
	public void user_clicks_on_write_a_Review_Link() {
		desktop.clickOnreviewLink();
		logger.info("User clicked on Review link");
	}

	@When("^User fill the review information with belwo information$")
	public void user_fill_the_review_information_with_belwo_information(DataTable info) {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		desktop.sendingValueToYourNameField(dataValues.get(0).get("yourName"));
		desktop.sendingValueToYourReviewField(dataValues.get(0).get("yourReview"));
		desktop.selectingRadioButton(dataValues.get(0).get("Rating"));
		logger.info("User filled the form");
		WebDriverUtility.screenShot();
		
	}

	@When("^User clicks on continue button$")
	public void user_clicks_on_continue_Button() {
		desktop.clickOnContinueButton();
		logger.info("User clicked on continue button");
	}

	
	
	@Then("^User sould see a messege with Thank you for your review\\. it has been submitted to the webMaster for approval$")
	public void user_sould_see_a_messege_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webMaster_for_approval() {
		String expectedMsg = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualMesg = desktop.reviewSucceesMsg();
		Assert.assertEquals(expectedMsg, actualMesg);
		logger.info("Review submitted successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
