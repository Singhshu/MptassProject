package mptaasPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import mptassTestCases.SchoolRenewalExit;

public class SchoolRenewalExitPage {
	static final Logger logger = Logger.getLogger(SchoolRenewalExit.class.getName());
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@FindBy(xpath = "//div[@id='MPTAASModal']//button[text()='Close']")
	WebElement closePopUp;

	@FindBy(xpath = "//input[@name='username']")
	WebElement enterUserName;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement login;

	@FindBy(xpath = "//span[text()='Admission Management']")
	WebElement admissionManagement;

	@FindBy(xpath = "//span[text()='Student Renewal']")
	WebElement studentRenewal;

	@FindBy(xpath = "//select[@name='ClassId']")
	WebElement selectClass;

	@FindBy(xpath = "//option[@value='7']")
	WebElement classSelected;

	@FindBy(xpath = "//option[@value='12']")
	WebElement classtwelfthSelected;

	@FindBy(xpath = "//button[@name='ctrlbtnSearch']")
	WebElement search;

	@FindBy(xpath = "//div[@class='dataTables_filter']//input")
	WebElement enterProfileId;

	@FindBy(xpath = "//a[text()=' Renew ']")
	WebElement renew;

	@FindBy(xpath = "//div[@id='divConfirmReNewAdmission']//input[@value='Grade']")
	WebElement gradeRadioButton;

	@FindBy(xpath = "//div[@id='divPassingGradePercentage']//input[@value='Grade']")
	WebElement failedGradeRadioButton;

	@FindBy(xpath = "//input[@value='Failed']")
	WebElement selectFailed;

	@FindBy(xpath = "//div[@id='divConfirmReNewAdmission']//select[@name='PassingGrade']")
	WebElement gradeDropDown;

	@FindBy(xpath = "//select[@id='ddlPassingGrade2' and @name='PassingGrade']")
	WebElement gradeDropDownExit;

	@FindBy(xpath = "//option[@value='B-1']")
	WebElement gradeSelected;

	@FindBy(xpath = "//option[@value='E']")
	WebElement failedGradeSelected;

	@FindBy(xpath = "//button[@name='ctrlbtnSubmitAdmission']")
	WebElement submit;

	@FindBy(xpath = "//button[@name='ctrlbtnSubmitAdmissionExit']")
	WebElement exitSubmit;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm swal-button--danger']")
	WebElement yes;

	@FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
	WebElement no;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement close;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement confimationOk;

	// Exit Scenario

	@FindBy(xpath = "//a[text()=' Exit ']")
	WebElement exit;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	public void closePOPUP() {
		closePopUp.click();
	}

	public SchoolRenewalExitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userName(String sUserName) {
		enterUserName.sendKeys(sUserName);
	}

	public void getPassword(String sPassword) {
		enterPassword.sendKeys(sPassword);
	}

	public void clickLogin() {
		login.click();
	}

	public void clickAdmissionManagement() {
		admissionManagement.click();
	}

	public void clickStudentRenewal() {
		studentRenewal.click();
	}

	public void clickSelectClass() {
		selectClass.click();
	}

	public void classSelected() {
		classSelected.click();
	}

	public void classTwelfthSelected() {
		classtwelfthSelected.click();
	}

	public void clickSearch() {
		search.click();
	}

	public void enterProfileId(String profileId) {
		enterProfileId.sendKeys(profileId);
		logger.info("Shubham Pal Singh");
	}

	public void clickRenew() {
		renew.click();
	}

	public void selectFailedRadioButton() {
		selectFailed.click();
	}

	public void clickGradeRadioButton() {
		gradeRadioButton.click();
	}

	public void clickfailedGradeRadioButton() {
		failedGradeRadioButton.click();
	}

	public void clickGradeDropDown() {
		gradeDropDown.click();
	}

	public void clickGradeDropDownExit() {
		gradeDropDownExit.click();
	}

	public void clickGradeSelected() {
		gradeSelected.click();
	}

	public void clickFailedGrade() {
		failedGradeSelected.click();
	}

	public void clickSubmit() {
		submit.click();
	}

	public void clickYes() {
		yes.click();
	}

	public void clickNo() {
		no.click();
	}

	public void clickClose() {
		close.click();
	}

	public void clickconfimationOk() {
		confimationOk.click();
	}

	public void clickLogOut() {
		logout.click();
	}

	// Exit Scenario
	public void clickExit() {
		exit.click();
	}

	public void clickExitSubmit() {
		exitSubmit.click();
	}

}