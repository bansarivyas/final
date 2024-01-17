package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.HomeloginPage;



public class Homeloginstepdef extends BaseClass {
	
	String UserName = "test data";

	@Given("Learner login to site by using {string} and {string}")
	public void Learner_login_to_site_by_using_and(String email, String password) {
		driver.get("https://test.clinicaloptions.com/login");
		HomeloginPage.sendUnamePword(email, password);
	}

	@Then("Learner able to see welcome title")
	public void Learner_able_to_see_welcome_title() {
		HomeloginPage.clickUserNameDropDown();
		HomeloginPage.see_Welcome_Username(UserName);
		driver.quit();
	}
}
