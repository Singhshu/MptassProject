package mptaasPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	WebDriver driver;

	@FindBy(xpath = "//input[@name='q']")
	WebElement getStarted;

	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")
	WebElement googleSearch;

	@FindBy(xpath = "//div[text()='Email or phone']")
	WebElement enterUserId;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement clickNext;

	@FindBy(xpath = "//div[text()='Enter your password']")
	WebElement enterPassword;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement singnIn;

	@FindBy(xpath = "//input[@id='login_field']")
	WebElement enterEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement enterGitPassword;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-block js-sign-in-button']")
	WebElement clickSignIn;

	public GooglePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterValue(String arg1) {
		getStarted.sendKeys(arg1);
	}

	public void clickOnSearch() {
		googleSearch.click();

	}

	public void userID(String sUserName) {
		enterUserId.sendKeys(sUserName);

	}

	public void next() {
		clickNext.click();
	}

	public void password(String sPassword) {
		enterPassword.sendKeys(sPassword);
	}

	public void gitLogin() {
		singnIn.click();
	}

	public void gitEmail(String sUserName) {
		enterEmail.sendKeys(sUserName);
	}

	public void gitPass(String sPassword) {
		enterGitPassword.sendKeys(sPassword);
	}

	public void gitSignIn() {
		clickSignIn.click();
	}

}
