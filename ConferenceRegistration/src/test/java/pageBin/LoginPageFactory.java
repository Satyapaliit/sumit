package pageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory
{
	WebDriver driver;

	public LoginPageFactory(WebDriver driver)
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfUserName;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	WebElement pfUserMessage;

	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfUserPassword;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	WebElement pfPasswordMessage;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement pfButton;

	/************************************************************setters**************************************************************/

	public void setPfUserName(String sUserName)
	{
		pfUserName.sendKeys(sUserName);
	}

	public void setPfUserPassword(String sUserPassword)
	{
		pfUserPassword.sendKeys(sUserPassword);
	}

	public void setPfButton()
	{
		pfButton.click();
	}

	
	/************************************************************getters**************************************************************/

	public WebElement getPfUserName()
	{
		return pfUserName;
	}

	public WebElement getPfUserMessage()
	{
		return pfUserMessage;
	}

	public WebElement getPfUserPassword()
	{
		return pfUserPassword;
	}

	public WebElement getPfPasswordMessage()
	{
		return pfPasswordMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
