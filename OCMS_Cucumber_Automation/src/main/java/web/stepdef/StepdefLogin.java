package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.LoginPage;


public class StepdefLogin extends BaseClass{
	
	@Given("I enter {string} using {string}{string}")
	public void i_enter_using(String url,String username,String password) {
		driver.get(url);
		
		
		LoginPage loginPage2 = new LoginPage(null);
		loginPage2.enterEmailID(username);
		LoginPage.enterPassword(password);
		
	}
	
	@When ("I click on signin button")
	public void i_click_on_signin_button() {
		LoginPage.clickOnSignIn();
		
	}
	
	@Then("I am able to see welcome title{string}")
	public void i_am_able_to_see_welcome_title(String Title) {
		LoginPage.see_welcome_Username(Title);
		//driver.quit();
	}
		
	
}
