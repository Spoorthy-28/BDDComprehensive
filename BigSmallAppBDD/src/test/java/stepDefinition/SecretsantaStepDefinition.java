package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.pageObject.SecretSantaGiftsPage;
import com.mindtree.resuablecomponents.Base;
import com.mindtree.uistore.HomePageUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class SecretsantaStepDefinition extends Base{
   
    @When("^user clicks on secretsanta gifts$")
    public void user_clicks_on_secretsanta_gifts() throws Throwable {
        SecretSantaGiftsPage sp = new SecretSantaGiftsPage(driver);
        sp.getsecretsantagifts();
    }

    @Then("^verify that the gifts are displayed in reverse alphabetic order$")
    public void verify_that_the_gifts_are_displayed_in_reverse_alphabetic_order() throws Throwable {
    	SecretSantaGiftsPage sp = new SecretSantaGiftsPage(driver);
        sp.reverseAlphabeticorderList();
    }

    @And("^selects ZtoA from the Sort by dropdown$")
    public void selects_za_from_the_sort_by_dropdown() throws Throwable {
    	SecretSantaGiftsPage sp = new SecretSantaGiftsPage(driver);
        sp.selectAtoZorder();
    }
    
}