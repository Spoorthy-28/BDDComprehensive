package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.NewPage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class NewPageStepDefinition extends Base{

	@When("^user clicks on New link$")
    public void user_clicks_on_new_link() throws Throwable {
       NewPage np = new NewPage(driver);
       np.clickNew();
    }

    @Then("^verify that the christmas postcard is added into the cart$")
    public void verify_that_the_christmas_postcard_is_added_into_the_cart() throws Throwable {
    	 NewPage np = new NewPage(driver);
        np.validateadd2cart();
    }

    @And("^selects christmas postcards followed by clicking on addtocart button$")
    public void selects_christmas_postcards_followed_by_clicking_on_addtocart_button() throws Throwable {
    	 NewPage np = new NewPage(driver);
         np.clickPostcards();
    }

}