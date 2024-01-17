package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage{
	
	@FindBy(how=How.ID, using="exampleInputEmail1")
	private WebElement emailID1;
	
	@FindBy(how=How.ID,using="password-1")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='login-form']/button")
	private static WebElement login;
	
	@FindBy(how=How.XPATH,using="//h3[normalize-space()='welcome,shweta sonar']")
	private static WebElement welcomeMessage;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver, driver);
	}
	public void enterEmailID(String email)
	{
		
		WebElement emailID = null;
		emailID.sendKeys(email);
	}
	public static void enterPassword(String pass)  
	{
				
	}
	public static void clickOnSignIn()
	{
		login.click();
	}
	
	public static void see_welcome_Username(String ExpectedUserMessage) {
		String actualTitlefield=welcomeMessage.getText();
		Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
		System.out.println("message found as " +actualTitlefield);
		
		
		
	}
}