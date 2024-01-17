

package web.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SoftToHardLoginPage {
	static WebDriver driver;
	
	@FindBy(xpath = "//*[@type='email']")
	
	WebElement Email;

	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;

	@FindBy(xpath = "(//*[text()='Log In'])[2]")
	WebElement btn_login;
	
	@FindBy(xpath = "(//*[text()='CCO User'])[2]")
	static
	WebElement userVerify;
	
	@FindBy(how = How.XPATH, using = "(//*[@id='dropdownMenuButton1'])[2]")
	static
     WebElement UserProfile;
	
	@FindBy(xpath ="//p[text()='testra1@mailinator.com']")
	WebElement HardUserID;
	
	static String str = "//p[text()='%s']";
	
	public  SoftToHardLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	public static void sendUnamePword(String Uname, String Pword) {
		
		
		System.out.println("User Logged in with the Email" +Uname);
	
		

	}
	
	public static void VerifyUser(String ExpectedHomepagetab) {
		
		
		String UserVerify = userVerify.getText();
		Assert.assertEquals(UserVerify, ExpectedHomepagetab);
		System.out.println("I am on Home page and the user is " + UserVerify);
	}
	

		public static void clickonMyProfile()
		{
			
			UserProfile.click();
		}
	
    public static void verifyHardLoggedInUser(String ExpectedHardUserID)
    {
   
    	
    	String ActualUserIDHardUser = driver.findElement(By.xpath(String.format(str, ExpectedHardUserID))).getText();
		Assert.assertEquals(ActualUserIDHardUser, ExpectedHardUserID);
		System.out.println("I am Logged in with user " + ExpectedHardUserID);
    	
    }


	public static void clickOnLogin() {
		// TODO Auto-generated method stub
		
	}



	public void verifyHardLogin(String hard_Login) {
		// TODO Auto-generated method stub
		
	}

}

