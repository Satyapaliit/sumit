package pageBin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConferenceRegistrationPageFactory
{
	WebDriver driver;

	public ConferenceRegistrationPageFactory(WebDriver driver)
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement pfFirstName;
	
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement pfLastName;
	
	@FindBy(id="txtEmail")
	@CacheLookup
	WebElement pfEmail;
	
	@FindBy(id="txtPhone")
	@CacheLookup
	WebElement pfPhone;
	
	@FindBy(name="size")
	@CacheLookup
	WebElement pfPersons;
	
	@FindBy(id="txtAddress1")
	@CacheLookup
	WebElement pfBuilding;
	
	@FindBy(id="txtAddress2")
	@CacheLookup
	WebElement pfArea;
	
	
	@FindBy(name="city")
	@CacheLookup
	WebElement pfCity;

	@FindBy(name="state")
	@CacheLookup
	WebElement pfState;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement pfStatus;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[14]/td/a")
	@CacheLookup
	WebElement pfNext;
	
	
	
	
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement pfCardholderName;
	
	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement pfDebitCardNo;
	
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement pfCvv;
	
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement pfMonth;
	
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement pfYear;
	
	@FindBy(css=".//*[@id='btnPayment']")
	@CacheLookup
	WebElement pfButton;


	/*****************************************setters**************************************************/
	
	public void setPfFirstName(String sFirstName) {
		pfFirstName.sendKeys(sFirstName);
	}

	public void setPfLastName(String sLastName) {
		pfLastName.sendKeys(sLastName);;
	}

	public void setPfEmail(String sEmail) {
		pfEmail.sendKeys(sEmail);
	}

	public void setPfPhone(String sPhone) {
		pfPhone.sendKeys(sPhone);
	}

	
	
	public void setPfCity(String sCity) {
		Select drpCity=new Select(pfCity);
		drpCity.selectByVisibleText(sCity);
	}

	public void setPfState(String sState) {
		Select drpCity=new Select(pfState);
		drpCity.selectByVisibleText(sState);
	}

	public void setPfPersons(String sPersons) {
		pfPersons.sendKeys(sPersons);
	}

	public void setPfCardholderName(String sCardholderName) {
		pfCardholderName.sendKeys(sCardholderName);
	}

	public void setPfDebitCardNo(String sDebitCardNo) {
		pfDebitCardNo.sendKeys(sDebitCardNo);
	}

	public void setPfCvv(String sCvv) {
		pfCvv.sendKeys(sCvv);
	}

	public void setPfMonth(String sMonth) {
		pfMonth.sendKeys(sMonth);
	}

	public void setPfYear(String sYear) {
		pfYear.sendKeys(sYear);
	}

	public void setPfButton() {
		pfButton.click();
	}


	/*****************************************getters**************************************************/

	public WebElement getPfFirstName() {
		return pfFirstName;
	}

	public WebElement getPfLastName() {
		return pfLastName;
	}

	public WebElement getPfEmail() {
		return pfEmail;
	}

	public WebElement getPfPhone() {
		return pfPhone;
	}

	public WebElement getPfCity() {
		return pfCity;
	}

	public WebElement getPfState() {
		return pfState;
	}

	public WebElement getPfPersons() {
		return pfPersons;
	}
	
	
	public WebElement getPfCardholderName() {
		return pfCardholderName;
	}

	public WebElement getPfDebitCardNo() {
		return pfDebitCardNo;
	}

	public WebElement getPfCvv() {
		return pfCvv;
	}

	public WebElement getPfMonth() {
		return pfMonth;
	}

	public WebElement getPfYear() {
		return pfYear;
	}

	
	
	
	public WebElement getPfBuilding() {
		return pfBuilding;
	}

	public WebElement getPfArea() {
		return pfArea;
	}

	public WebElement getPfStatus() {
		return pfStatus;
	}

	public void setPfBuilding(String sBuilding) {
		pfBuilding.sendKeys(sBuilding);
	}

	public void setPfArea(String sArea) {
		pfArea.sendKeys(sArea);
	}

	public void setPfStatus() {
		pfStatus.click();
	}

	public void setPfNext() {
		pfNext.click();
	}

	
	
	
	
	
	
	
	
	
	
	
}
