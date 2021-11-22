package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class PersonalizedGiftsStepDefinition extends Base{
	@Given("^invoke the chrome driver$")
    public void invoke_the_chrome_driver() throws Throwable {
		driver = invokeBrowser();
    }
    @When("^user selects a personalized name plate$")
    public void user_selects_a_personalized_name_plate() throws Throwable {
    	PersonalizedGiftsPage pgp= new PersonalizedGiftsPage(driver);
        pgp.getPersonalizedNamePlate();
    }

    @Then("^verify that user is unable to add the item into the cart$")
    public void verify_that_user_is_unable_to_add_the_item_into_the_cart() throws Throwable {
    	PersonalizedGiftsPage pgp= new PersonalizedGiftsPage(driver);
        pgp.validateText();
    }

    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^click on personized gifts$")
    public void click_on_personized_gifts() throws Throwable {
        HomePage hp = new HomePage(driver);
        hp.getPersonilizedGifts();
    }

    @And("^clicks on add to cart button leaving the name textbox blank$")
    public void clicks_on_add_to_cart_button_leaving_the_name_textbox_blank() throws Throwable {
    	PersonalizedGiftsPage pgp= new PersonalizedGiftsPage(driver);
        pgp.addToCart();
    }
    @And("^close the driver$")
    public void close_the_driver() throws Throwable {
        driver.close();
    }


}