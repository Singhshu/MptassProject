package mptaasPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	SchoolRenewalExitPage objLogin;
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	@BeforeTest
	public void Loginsetup(String text) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		/* driver.get("http://10.115.197.39/School/Account/Login"); */
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void Login(String Username,String Password) throws Exception {
		objLogin = new SchoolRenewalExitPage(driver);
		Thread.sleep(3000);
		objLogin.closePOPUP();
		Thread.sleep(3000);
		/* String sUserName = "SE1000000030"; */
		objLogin.userName(Username);
		Thread.sleep(5000);
		/* String sPassword = "1234"; */
		objLogin.getPassword(Password);
		Thread.sleep(5000);
		objLogin.clickLogin();
	}
	
	
}
