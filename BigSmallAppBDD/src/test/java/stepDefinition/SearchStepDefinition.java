package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.resuablecomponents.Base;
import com.mindtree.uistore.HomePageUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class SearchStepDefinition extends Base{
    @When("^user enters (.+) in the search bar and press enter$")
    public void user_enters_in_the_search_bar_and_press_enter(String text) throws Throwable {
    	HomePage hp = new HomePage(driver);
        hp.getSearch().click();
        hp.getSearch().sendKeys(text);
        hp.getSearch().sendKeys(Keys.ENTER);
    }

    @Then("^verify that the searched item is displayed in the search results$")
    public void verify_that_the_searched_item_is_displayed_in_the_search_results() throws Throwable {
        HomePage hp = new HomePage(driver);
        hp.validateSearch();
    }
}