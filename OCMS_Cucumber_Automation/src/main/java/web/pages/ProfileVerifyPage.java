package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfileVerifyPage {
	
	static WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@class,'first_last')])[2]")
	static
     WebElement UserProfile;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='My Events'])[2]")
	private static WebElement clickOnMyEvents;
	
	
	
	
	public ProfileVerifyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static void clickOnProfile() {
			UserProfile.click();
		}
	
	public static void clickOnMyEvents() {
		clickOnMyEvents.click();
		}

}
