package mptassTestCases;

import static utility.ConfigReader.getPassword;
import static utility.ConfigReader.getProfileId1;
import static utility.ConfigReader.getProfileId2;
import static utility.ConfigReader.getUrl;
import static utility.ConfigReader.getUsername;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
/*import org.apache.logging.log4j.Logger;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import extentlisteners.ExtentListeners;
import mptaasPages.BaseClass;
import mptaasPages.SchoolRenewalExitPage;

public class SchoolRenewalExit extends ExtentListeners {
	static final Logger logger = Logger.getLogger(SchoolRenewalExit.class.getName());
	
	WebDriver driver;
	SchoolRenewalExitPage objLogin;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		/* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); */
		driver.get(getUrl());
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException, InterruptedException {
		objLogin = new SchoolRenewalExitPage(driver);
		PropertyConfigurator.configure("log4j.properties");
		objLogin.closePOPUP();
		logger.info("Pop-Up closed");
		objLogin.userName(getUsername());
		logger.info("User name entered");
		Thread.sleep(3000);
		objLogin.getPassword(getPassword());
		logger.info("password entered");
		Thread.sleep(3000);
		objLogin.clickLogin();
	}

	@Test(priority = 1)
	public void classNotRenewed() throws Exception {
		objLogin = new SchoolRenewalExitPage(driver);
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(10000);
		objLogin.clickAdmissionManagement();
		logger.info("Shubham Pal Singh");
		Thread.sleep(3000);
		objLogin.clickStudentRenewal();
		Thread.sleep(3000);
		objLogin.clickSelectClass();
		Thread.sleep(3000);
		objLogin.classSelected();
		Thread.sleep(3000);
		objLogin.clickSearch();
		Thread.sleep(3000);
		objLogin.enterProfileId(getProfileId1());
		Thread.sleep(3000);
		objLogin.clickRenew();
		Thread.sleep(3000);
		objLogin.clickGradeRadioButton();
		Thread.sleep(3000);
		objLogin.clickGradeDropDown();
		Thread.sleep(3000);
		objLogin.clickGradeSelected();
		Thread.sleep(3000);
		objLogin.clickSubmit();
		Thread.sleep(3000);
		objLogin.clickNo();
		Thread.sleep(3000);
		objLogin.clickClose();
		Thread.sleep(3000);
		objLogin.clickLogOut();
	}

	@Test(priority = 2)
	public void classNotExited() throws Exception {
		objLogin = new SchoolRenewalExitPage(driver);
		PropertyConfigurator.configure("log4j.properties");
		Thread.sleep(10000);
		objLogin.clickAdmissionManagement();
		Thread.sleep(3000);
		objLogin.clickStudentRenewal();
		Thread.sleep(5000);
		objLogin.clickSelectClass();
		Thread.sleep(3000);
		objLogin.classTwelfthSelected();
		objLogin.clickSearch();
		Thread.sleep(3000);
		objLogin.enterProfileId(getProfileId1());
		Thread.sleep(5000);
		objLogin.clickExit();
		Thread.sleep(3000);
		objLogin.selectFailedRadioButton();
		Thread.sleep(3000);
		objLogin.clickfailedGradeRadioButton();
		Thread.sleep(3000);
		objLogin.clickGradeDropDownExit();
		Thread.sleep(3000);
		objLogin.clickFailedGrade();
		Thread.sleep(5000);
		objLogin.clickExitSubmit();
		Thread.sleep(3000);
		objLogin.clickNo();
		Thread.sleep(3000);
		objLogin.clickClose();
		Thread.sleep(3000);
		objLogin.clickLogOut();
	}

	@Test(priority = 3)
	public void classRenewal() throws Exception {
		objLogin = new SchoolRenewalExitPage(driver);
		Thread.sleep(3000);
		objLogin.clickAdmissionManagement();
		Thread.sleep(3000);
		objLogin.clickStudentRenewal();
		Thread.sleep(5000);
		objLogin.clickSelectClass();
		Thread.sleep(3000);
		objLogin.classSelected();
		objLogin.clickSearch();
		Thread.sleep(3000);
		objLogin.enterProfileId(getProfileId2());
		Thread.sleep(5000);
		objLogin.clickRenew();
		Thread.sleep(3000);
		objLogin.clickGradeRadioButton();
		objLogin.clickGradeDropDown();
		Thread.sleep(3000);
		objLogin.clickGradeSelected();
		objLogin.clickSubmit();
		Thread.sleep(3000);
		objLogin.clickYes();
		Thread.sleep(1000);
		objLogin.clickconfimationOk();
		objLogin.clickLogOut();
	}

	@Test(priority = 4)
	public void classExited() throws Exception {
		objLogin = new SchoolRenewalExitPage(driver);
		Thread.sleep(3000);
		objLogin.closePOPUP();
		Thread.sleep(3000);
		Thread.sleep(10000);
		objLogin.clickAdmissionManagement();
		Thread.sleep(3000);
		objLogin.clickStudentRenewal();
		Thread.sleep(5000);
		objLogin.clickSelectClass();
		Thread.sleep(3000);
		objLogin.classTwelfthSelected();
		objLogin.clickSearch();
		Thread.sleep(3000);
		objLogin.enterProfileId(getProfileId2());
		Thread.sleep(5000);
		objLogin.clickExit();
		Thread.sleep(3000);
		objLogin.selectFailedRadioButton();
		Thread.sleep(3000);
		objLogin.clickfailedGradeRadioButton();
		Thread.sleep(3000);
		objLogin.clickGradeDropDownExit();
		Thread.sleep(3000);
		objLogin.clickFailedGrade();
		Thread.sleep(5000);
		objLogin.clickExitSubmit();
		Thread.sleep(3000);
		objLogin.clickYes();
		Thread.sleep(1000);
		objLogin.clickconfimationOk();
		objLogin.clickLogOut();

	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
