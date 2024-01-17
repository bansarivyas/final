package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import web.pages.HomeloginPage;
import web.pages.ProfileVerifyPage;

public class StepDefProfileVerify extends BaseClass {
	
	String MyEventsTitle = "My Events";
	String MyCertificatesTitle = "My Certificates";
	String MySurveysTitle = "My Surveys";
	String MyProfileTitle = "My Profile";
	
	@Given("Learner login to site by {string} and {string}")
	public void Learner_login_to_site_by_and(String email, String password) {
		driver.get("https://test.clinicaloptions.com/login");
		HomeloginPage.sendUnamePword(email, password);
	}
	
	@Then("Learner click on profile")
	public void learner_click_on_profile() {
		HomeloginPage.clickUserNameDropDown();
	   
	}

	@Then("Learner verify all modules")
	public void learner_verify_all_modules() {
		HomeloginPage.clickOnMyEvents();
		HomeloginPage.VerifyMyEventsTitle(MyEventsTitle);
		
		HomeloginPage.clickUserNameDropDown();
		HomeloginPage.clickOnMyCertificates();
		HomeloginPage.VerifyMyCertificatesTitle(MyCertificatesTitle);
		
		HomeloginPage.clickUserNameDropDown();
		HomeloginPage.clickOnMySurveys();
		HomeloginPage.VerifyMySurveysTitle(MySurveysTitle);
		
		HomeloginPage.clickUserNameDropDown();
		HomeloginPage.clickOnMyProfile();
		HomeloginPage.VerifyMyProfileTitle(MyProfileTitle);
	}

}
