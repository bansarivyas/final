package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeloginPage {
	
	static WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@type='email']")
	private static WebElement emailID;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "(//*[text()='Log In'])[2]")
	private static WebElement login;
	
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private static WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Welcome, test data']")
	private static WebElement welcomeMessage;
	
	@FindBy(how = How.XPATH, using = "(//*[@id='dropdownMenuButton1'])[2]")
	private static WebElement usernameDropDown;
	
	
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Events'])[2]")
	private static WebElement clickOnMyEvents;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='test data'])[2]")
	private static WebElement usernameVerify;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Events'])[3]")
	private static WebElement verifyMyEventsTitle;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Certificates'])[2]")
	private static WebElement clickOnMyCertificates;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Certificates'])[3]")
	private static WebElement verifyMyCertificatesTitle;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'dropdown-item hdercls')])[5]")
	private static WebElement clickOnMySurveys;
	
	@FindBy(how = How.XPATH, using = "//*[text()='My Surveys']")
	private static WebElement verifyMySurveys;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Profile'])[2]")
	private static WebElement clickOnMyProfile;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Profile'])[3]")
	private static WebElement verifyMyProfile;
	
	
	

	public HomeloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
public static void sendUnamePword(String Uname, String Pword) {
		
	    emailID.sendKeys(Uname);
		System.out.println("User Logged in with the Email" +Uname);
		password.sendKeys(Pword);
		loginButton.click();
	}

	public static void see_Welcome_Username(String ExpectedUserMessage) {
		String actualTitlefield = usernameVerify.getText();
		Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
		System.out.println("Message found as  " + actualTitlefield);
	}
	
public static void clickUserNameDropDown() {
		
	usernameDropDown.click();
	}





public static void clickOnMyEvents() {
	clickOnMyEvents.click();
	}

public static void VerifyMyEventsTitle(String ExpectedUserMessage) {
	String actualTitlefield = verifyMyEventsTitle.getText();
	Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
	System.out.println("Title is  " + actualTitlefield);
}

public static void clickOnMyCertificates() {
	clickOnMyCertificates.click();
	}

public static void VerifyMyCertificatesTitle(String ExpectedUserMessage) {
	String actualTitlefield = verifyMyCertificatesTitle.getText();
	Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
	System.out.println("Title is  " + actualTitlefield);
}

public static void clickOnMySurveys() {
	clickOnMySurveys.click();
	}

public static void VerifyMySurveysTitle(String ExpectedUserMessage) {
	String actualTitlefield = verifyMySurveys.getText();
	Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
	System.out.println("Title is  " + actualTitlefield);
}

public static void clickOnMyProfile() {
	clickOnMyProfile.click();
	}

public static void VerifyMyProfileTitle(String ExpectedUserMessage) {
	String actualTitlefield = verifyMyProfile.getText();
	Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
	System.out.println("Title is  " + actualTitlefield);
}
}