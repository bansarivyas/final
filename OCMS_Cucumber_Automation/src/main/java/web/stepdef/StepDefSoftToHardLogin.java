package web.stepdef;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.HomeloginPage;
import web.pages.SoftLoginForHardLoggedInUser;
import web.pages.SoftToHardLoginPage;


public class StepDefSoftToHardLogin  extends BaseClass {

	String UserVerify = "CCO User";

	@Given("Learner login to website by {string} and {string}")
	public void Learner_login_to_website_by_and(String Uname, String Pword) {
		
		driver.get("https://test.clinicaloptions.com/events/targeted-therapeutics-in-cll-and-mcl-applying-emerging-btk-inhibitor-therapy-data-to-practice/emerging-btk-inhibitor-therapy/10532-11284?token=C5B9804E-5E5C-4DBC-B211-B7361442CC78");

	
		//SoftLoginToHardLoginPage.sendUnamePword(Uname, Pword);
		//SoftToHardLoginPage.sendUnamePword(Uname, Pword);
		SoftToHardLoginPage.clickonMyProfile();
		SoftToHardLoginPage.VerifyUser(UserVerify);
	}

	@When("Learner hit Soft login {string} user redirects to an activity")
	public void Learner_hit_soft_login_user_redirects_to_an_activity(String Url) {
		
		driver.get("https://test.clinicaloptions.com/CE-CME/administration-and-training/multimedia-activity/18290-26235?token=448AB6B4-4D81-4BF9-BB50-DB5852DC46AA\r\n");
	    
		//selUtil.hardWait(3);
		//driver.getCurrentUrl();
		
	}
	

	@Then("Learner  {string} override the Soft Login user")
	public void Learner_override_the_soft_login_user(String Hard_Login) {
		
		driver.navigate().refresh();
		SoftToHardLoginPage.clickonMyProfile();
		SoftToHardLoginPage.VerifyUser(UserVerify);		
		
	}

	}


