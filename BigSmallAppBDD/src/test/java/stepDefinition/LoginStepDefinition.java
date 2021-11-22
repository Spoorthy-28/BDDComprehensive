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
public class LoginStepDefinition extends Base{
	@When("^user enters invalid username and password$")
    public void user_enters_invalid_username_and_password() throws Throwable {
		HomePage hp = new HomePage(driver);
        hp.getdetails();
    }

    @Then("^verify that the user is unable to log in to the page$")
    public void verify_that_the_user_is_unable_to_log_in_to_the_page() throws Throwable {
    	HomePage hp = new HomePage(driver);
        hp.validateLogin();
    }

    @And("^click on sign in$")
    public void click_on_sign_in() throws Throwable {
        HomePage hp = new HomePage(driver);
        hp.clicksignin();
    }

    @And("^clicks on sign in button$")
    public void clicks_on_sign_in_button() throws Throwable {
    	HomePage hp = new HomePage(driver);
        hp.getsigninbutton();
    }
}