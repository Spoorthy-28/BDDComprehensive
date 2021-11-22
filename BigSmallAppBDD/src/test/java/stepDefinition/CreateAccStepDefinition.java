package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class CreateAccStepDefinition extends Base{
	@When("^user enters email and password$")
    public void user_enters_email_and_password() throws Throwable {
		 HomePage hp = new HomePage(driver);
	     hp.enterDetails();
    }

    @Then("^verify that a new account is created for the user$")
    public void verify_that_a_new_account_is_created_for_the_user() throws Throwable {
    	 HomePage hp = new HomePage(driver);
         hp.createAcc();
    }

    @And("^click on sign in followed by create account$")
    public void click_on_sign_in_followed_by_create_account() throws Throwable {
        HomePage hp = new HomePage(driver);
        hp.getsignin();
    }

    @And("^clicks on create button$")
    public void clicks_on_create_button() throws Throwable {
    	 HomePage hp = new HomePage(driver);
         hp.clickcreate();
    }

}