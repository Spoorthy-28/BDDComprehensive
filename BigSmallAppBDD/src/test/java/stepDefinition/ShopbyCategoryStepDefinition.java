package stepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.pageObject.ShopByCategoryPage;
import com.mindtree.resuablecomponents.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
public class ShopbyCategoryStepDefinition extends Base{
	@When("^user selects unicornplushkeychain and increments the quantity of it$")
    public void user_selects_unicornplushkeychain_and_increments_the_quantity_of_it() throws Throwable {
		ShopByCategoryPage sp = new ShopByCategoryPage(driver);
        sp.icrQty();
    }

    @Then("^verify that the item is not added into the cart due to exceeded quantity$")
    public void verify_that_the_item_is_not_added_into_the_cart_due_to_exceeded_quantity() throws Throwable {
    	ShopByCategoryPage sp = new ShopByCategoryPage(driver);
        sp.exceededOrderQuantity();
    }

    @And("^Hovers onto shopbycategory followed by shopbyperson followed by unicorncrazy$")
    public void hovers_onto_shopbycategory_followed_by_shopbyperson_followed_by_unicorncrazy() throws Throwable {
        ShopByCategoryPage sp = new ShopByCategoryPage(driver);
        sp.selectuncorncrazy();
    }

    @And("^clicks on add to cart button$")
    public void clicks_on_add_to_cart_button() throws Throwable {
    	ShopByCategoryPage sp = new ShopByCategoryPage(driver);
        sp.clickadd2cart();
    }
}