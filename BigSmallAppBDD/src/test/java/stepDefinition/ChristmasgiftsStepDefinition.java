package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.ChristmasGiftsPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class ChristmasgiftsStepDefinition extends Base{
	@When("^user clicks on star lights followed by add to wishlist$")
    public void user_clicks_on_star_lights_followed_by_add_to_wishlist() throws Throwable {
		 ChristmasGiftsPage cp = new ChristmasGiftsPage(driver);
	     cp.getstralights();
    }

    @Then("^verify that the star lights are moved from wishlist to the cart$")
    public void verify_that_the_star_lights_are_moved_from_wishlist_to_the_cart() throws Throwable {
    	 ChristmasGiftsPage cp = new ChristmasGiftsPage(driver);
         cp.validatewishlist2cart();
    }

    @And("^clicks on christmas gifts$")
    public void clicks_on_christmas_gifts() throws Throwable {
        ChristmasGiftsPage cp = new ChristmasGiftsPage(driver);
        cp.getcgifts();
    }

    @And("^selects view wishlist followed by access wishlist followed by add to cart button$")
    public void selects_view_wishlist_followed_by_access_wishlist_followed_by_add_to_cart_button() throws Throwable {
    	 ChristmasGiftsPage cp = new ChristmasGiftsPage(driver);
         cp.wishlist2cart();
    }
}