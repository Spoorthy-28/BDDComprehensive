package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.CorporateGiftsPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class CorporateGiftsStepDefinition extends Base{
	@When("^user enters all the details and clicks on submit button$")
    public void user_enters_all_the_details_and_clicks_on_submit_button() throws Throwable {
		CorporateGiftsPage cp = new CorporateGiftsPage(driver);
        cp.getDetails();
    }

    @Then("^verify if contact us is successful or not$")
    public void verify_if_contact_us_is_successful_or_not() throws Throwable {
    	CorporateGiftsPage cp = new CorporateGiftsPage(driver);
        cp.validateContactus();
    }

    @And("^click on corporate gifts$")
    public void click_on_corporate_gifts() throws Throwable {
        CorporateGiftsPage cp = new CorporateGiftsPage(driver);
        cp.clickCorporateGifts();
    }

}