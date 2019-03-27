package LoginPage;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageBin.LoginPageFactory;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"})
public class LoginPageStepDef
{
	WebDriver driver;
	LoginPageFactory pfObject;
	
	
	

@Given("^user is on the Login Page$")
public void user_is_on_the_Login_Page() throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU\\Desktop\\Material\\Module3\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	pfObject=new LoginPageFactory(driver);
	driver.get("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/login.html");
  
}

@When("^User enters the valid data$")
public void user_enters_the_valid_data() throws Throwable
{
	pfObject.getPfUserName().clear();
	Thread.sleep(2000);
	pfObject.setPfUserName("capgemini");
	
	pfObject.getPfUserPassword().clear();
	Thread.sleep(2000);
	pfObject.setPfUserPassword("capg1234");
 
  
}

@When("^Clicks on the Submit button$")
public void clicks_on_the_Submit_button() throws Throwable
{
	Thread.sleep(2000);
	pfObject.setPfButton();
  
}

@Then("^Navigate to Welcome Page$")
public void navigate_to_Welcome_Page() throws Throwable
{
	driver.navigate().to("file:///C:/Users/SATYAPKU/Desktop/Material/Module3/hotelbooking.html");
	Thread.sleep(2000);
	driver.close();
}

@When("^User enters the invalid UserName$")
public void user_enters_the_invalid_UserName() throws Throwable
{
	pfObject.setPfUserName("satyapal");
	Thread.sleep(2000);
	pfObject.setPfUserPassword("capg1234");
	Thread.sleep(2000);
	
 
  
}

@Then("^Display Alert message$")
public void display_Alert_message() throws Throwable
{
	System.out.println("***************"+driver.switchTo().alert().getText()+"******************");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.close();
}

@When("^User enters the invalid Password$")
public void user_enters_the_invalid_Password() throws Throwable
{
	pfObject.setPfUserName("capgemini");
	Thread.sleep(2000);
	pfObject.setPfUserPassword("capg124");
	Thread.sleep(2000);
  
}

@When("^User enters the invalid Data$")
public void user_enters_the_invalid_Data(DataTable arg1) throws Throwable
{
	pfObject.setPfUserName("satyapal");
	Thread.sleep(2000);
	pfObject.setPfUserPassword("capg124");
	Thread.sleep(2000);
}



}
