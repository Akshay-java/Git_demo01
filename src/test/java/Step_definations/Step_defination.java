package Step_definations;

import Base.base;
import POM.Greencart_Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_defination extends Greencart_Home{
	
	
	@Given ("^Chrome browser should be launched$")
	public void Chome_launch()
	{
		base.LaunchBrowser();
	}
	
	@And ("^(.+) Website should be opened$")
	public void launch_weblink(String str) throws Exception
	{
		base.launch_url(str);
	}
	
	@Given ("^I should see Greencart homepage$")
	public void Greencart_HomePage()
	{
		System.out.println("GIT1_updat");
	}
	
	@And ("^I should see vegitable with name (.+)")
	public void vegitable_visible(String str) throws Throwable
	{
		Greencart_Home.ValidateAdded_product(str);
	}
	@Then("^I click on (.+) button$")
	public void click_button(String strArg1) throws Throwable 
	{
		System.out.println("GIT2_eupdate");
	}

	@And("^I add count of vegitables$")
	public void i_add_count_of_vegitables() throws Throwable 
	{
		
	}
	
	@And("^I navigate to shopping cart$")
	public void i_navigate_to_shopping_cart() throws Throwable 
	{
		
	}
	
	@And("^I see (.+) vegitable in cart$")
	public void i_see_vegitable_in_cart(String vegitablename) throws Throwable 
	{
		
	}
	
	@When("^I enter (.+) in search box$")
    public void i_enter_in_search_box(String vegitablename) throws Throwable 
	{
		Greencart_Home.search_box(vegitablename);
    }

    

	
	

}
