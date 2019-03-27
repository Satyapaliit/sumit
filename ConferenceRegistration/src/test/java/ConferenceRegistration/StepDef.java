package ConferenceRegistration;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageBin.ConferenceRegistrationPageFactory;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"})
public class StepDef
{
	WebDriver driver;
	ConferenceRegistrationPageFactory pfObject;
	

@Given("^The User is on the Conference Registration Page$")
public void the_User_is_on_the_Conference_Registration_Page() throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU\\Desktop\\Material\\Module3\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	pfObject=new ConferenceRegistrationPageFactory(driver);
	driver.get("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\ConferenceRegistartion.html");
  
}

@Then("^Check the Title of the Conference Registration Page$")
public void check_the_Title_of_the_Conference_Registration_Page() throws Throwable
{
	String title=driver.getTitle();
	if(title.contentEquals("Conference Registartion"))
	{
		System.out.println("***********Title Matched**************");
	}
	else
	{
		System.out.println("***********Title Not Matched**************");
	}
	Thread.sleep(0);
	driver.close();
  
}

@When("^user leaves the First Name Empty$")
public void user_leaves_the_First_Name_Empty() throws Throwable
{
	pfObject.setPfFirstName("");
  
}

@When("^Clicks on the Next$")
public void clicks_on_the_Next() throws Throwable
{
	pfObject.setPfNext();
  
}

@Then("^Display the Error Message$")
public void display_the_Error_Message() throws Throwable
{
	System.out.println("*****************"+driver.switchTo().alert().getText()+"***************");
	  driver.switchTo().alert().accept();
	  Thread.sleep(0);
	  driver.close();
   
  
}

@When("^user leaves the Last Name Empty$")
public void user_leaves_the_Last_Name_Empty() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("");Thread.sleep(0);
  
}

@When("^user leaves the Invalid Email$")
public void user_leaves_the_Invalid_Email() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("saty@.com");Thread.sleep(0);
  
}

@When("^user leaves the Phone Empty$")
public void user_leaves_the_Phone_Empty() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("");Thread.sleep(0);
  
}

@When("^User Mobile Number is Invalid$")
public void user_Mobile_Number_is_Invalid() throws Throwable
{
	if(Pattern.matches("^[7-9]{1}[0-9]{9}$",pfObject.getPfPhone().getText()))
	   {
		   System.out.println("***** Matched" + pfObject.getPfPhone().getText()+ "*****");
	   }
	   else
	   {
		   System.out.println("*****Not Matched" + pfObject.getPfPhone().getText()+ "*****");
	   }
  
}

@When("^user Does not select the Number of Persons$")
public void user_Does_not_select_the_Number_of_Persons() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("");Thread.sleep(0);
  
}



@When("^user leaves Building Name Empty$")
public void user_leaves_Building_Name_Empty() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("");
	
}


@When("^user leaves Area Name Empty$")
public void user_leaves_Area_Name_Empty() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("GLC G102");
    pfObject.setPfArea("");
  
}

@When("^user Does not select the City$")
public void user_Does_not_select_the_City() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("GLC G102");
    pfObject.setPfArea("Talwade");
    pfObject.setPfCity("Select City");
  
}

@When("^user Does not select the State$")
public void user_Does_not_select_the_State() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("GLC G102");
    pfObject.setPfArea("Talwade");
    pfObject.setPfCity("Pune");
    pfObject.setPfState("Select State");
  
}

@When("^user Does not select the Membership Status$")
public void user_Does_not_select_the_Membership_Status() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("GLC G102");
    pfObject.setPfArea("Talwade");
    pfObject.setPfCity("Pune");
    pfObject.setPfState("Maharashtra");
    
  
}

@When("^User enters all valid data$")
public void user_enters_all_valid_data() throws Throwable
{
	pfObject.setPfFirstName("Satyapal"); Thread.sleep(0);
    pfObject.setPfLastName("Kumar");Thread.sleep(0);
    pfObject.setPfEmail("satyapal@gmail.com");Thread.sleep(0);
    pfObject.setPfPhone("7618515569");Thread.sleep(0);
    pfObject.setPfPersons("3");Thread.sleep(0);
    pfObject.setPfBuilding("GLC G102");
    pfObject.setPfArea("Talwade");
    pfObject.setPfCity("Pune");
    pfObject.setPfState("Maharashtra");
    pfObject.setPfStatus();
  
}

@Then("^Navigate to the payment Page$")
public void navigate_to_the_payment_Page() throws Throwable
{
	driver.switchTo().alert().accept();
	Thread.sleep(0);
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	Thread.sleep(0);
  
}

@Then("^Check the Title of the PaymentDetails Page$")
public void check_the_Title_of_the_PaymentDetails_Page() throws Throwable
{
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	Thread.sleep(0);
	
	String title=driver.getTitle();
	if(title.contentEquals("Payment Details"))
	{
		System.out.println("***********Title Matched**************");
	}
	else
	{
		System.out.println("***********Title Not Matched**************");
	}
	Thread.sleep(0);
	
   driver.close();
  
}


@Given("^The User is on the Payment Details Page$")
public void the_User_is_on_the_Payment_Details_Page() throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATYAPKU\\Desktop\\Material\\Module3\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	pfObject=new ConferenceRegistrationPageFactory(driver);
	driver.get("C:\\\\NewWorkSpace\\\\ConferenceRegistration\\\\HTML Files\\\\PaymentDetails.html");
}

@When("^user leaves the Card Holder Name Empty$")
public void user_leaves_the_Card_Holder_Name_Empty() throws Throwable
{
	Thread.sleep(0);
	pfObject.setPfCardholderName("");
	Thread.sleep(0);
  
}



@When("^Clicks on Make Payment Button$")
public void clicks_on_Make_Payment_Button() throws Throwable
{
	pfObject.setPfButton();
	Thread.sleep(0);
	
}

@Then("^Display Error Message$")
public void display_Error_Message() throws Throwable
{
	String errorMsg=driver.switchTo().alert().getText();
	System.out.println("*********"+errorMsg+"****************");
	Thread.sleep(0);
	driver.switchTo().alert().accept();
	Thread.sleep(0);
	driver.close();
}

@When("^user leaves the Debit Card Number Empty$")
public void user_leaves_the_Debit_Card_Number_Empty() throws Throwable
{
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	Thread.sleep(0);
	pfObject.getPfCardholderName().clear();
	pfObject.getPfDebitCardNo().clear();
	pfObject.getPfCvv().clear();
	pfObject.getPfMonth().clear();
	pfObject.getPfYear().clear();
	
	pfObject.setPfCardholderName("Satyapal Kumar");
	pfObject.setPfDebitCardNo("");Thread.sleep(0);
}

@When("^user leaves the Debit Card CVV Number Empty$")
public void user_leaves_the_Debit_Card_CVV_Number_Empty() throws Throwable
{
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	pfObject.getPfCardholderName().clear();
	pfObject.getPfDebitCardNo().clear();
	pfObject.getPfCvv().clear();
	pfObject.getPfMonth().clear();
	pfObject.getPfYear().clear();
	pfObject.setPfCardholderName("Satyapal Kumar");
	pfObject.setPfDebitCardNo("7884586958254578");Thread.sleep(0);
    pfObject.setPfCvv("");Thread.sleep(0);
  
}

@When("^user leaves the Debit Card Month Empty$")
public void user_leaves_the_Debit_Card_Month_Empty() throws Throwable
{
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	pfObject.getPfCardholderName().clear();
	pfObject.getPfDebitCardNo().clear();
	pfObject.getPfCvv().clear();
	pfObject.getPfMonth().clear();
	pfObject.getPfYear().clear();
	pfObject.setPfCardholderName("Satyapal Kumar");
	pfObject.setPfDebitCardNo("7884586958254578");Thread.sleep(0);
    pfObject.setPfCvv("548");Thread.sleep(0);
    pfObject.setPfMonth("");
  
}

@When("^user leaves the Debit Card Year Empty$")
public void user_leaves_the_Debit_Card_Year_Empty() throws Throwable
{
	pfObject.getPfCardholderName().clear();
	pfObject.getPfDebitCardNo().clear();
	pfObject.getPfCvv().clear();
	pfObject.getPfMonth().clear();
	pfObject.getPfYear().clear();
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	pfObject.setPfCardholderName("Satyapal Kumar");
	pfObject.setPfDebitCardNo("7884586958254578");Thread.sleep(0);
    pfObject.setPfCvv("548");Thread.sleep(0);
    pfObject.setPfMonth("11");
    pfObject.setPfYear("");
  
}


@When("^user enters all valid  payment details$")
public void user_enters_all_valid_payment_details() throws Throwable
{
	pfObject.getPfCardholderName().clear();
	pfObject.getPfDebitCardNo().clear();
	pfObject.getPfCvv().clear();
	pfObject.getPfMonth().clear();
	pfObject.getPfYear().clear();
	driver.navigate().to("C:\\NewWorkSpace\\ConferenceRegistration\\HTML Files\\PaymentDetails.html");
	pfObject.setPfCardholderName("Satyapal Kumar");
	pfObject.setPfDebitCardNo("7884586958254578");Thread.sleep(0);
    pfObject.setPfCvv("548");Thread.sleep(0);
    pfObject.setPfMonth("11");
    pfObject.setPfYear("2024");
}

@Then("^show successfull$")
public void show_successfull() throws Throwable
{
	System.out.println("payment Successfull!");
}
	

}
