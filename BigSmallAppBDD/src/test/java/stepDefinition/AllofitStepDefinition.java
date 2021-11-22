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
public class AllofitStepDefinition extends Base{
	@When("^user selects a christmas tree mug$")
    public void user_selects_a_christmas_tree_mug() throws Throwable {
		 AllofitPage ap = new AllofitPage(driver);
	     ap.getChristmasmug();
    }

    @Then("^verify that COD is available or not for the enterd pincode$")
    public void verify_that_cod_is_available_or_not_for_the_enterd_pincode() throws Throwable {
    	 AllofitPage ap = new AllofitPage(driver);
         ap.validateCOD();
    }

    @And("^click on Allofit link$")
    public void click_on_allofit_link() throws Throwable {
        AllofitPage ap = new AllofitPage(driver);
        ap.clickAllofitLink();
    }

    @And("^enters the pincode followed by clicking on the check button$")
    public void enters_the_pincode_followed_by_clicking_on_the_check_button() throws Throwable {
    	 AllofitPage ap = new AllofitPage(driver);
         ap.check();
    }
}