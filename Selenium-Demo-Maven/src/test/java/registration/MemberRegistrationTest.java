package registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import memberRegistrationPO.MemberRegistrationPO;

public class MemberRegistrationTest {

	WebDriver driver;
		@BeforeMethod
		public void launch() throws Exception {
			System.setProperty("webdriver.chrome.driver", "D:\\D-data\\Selenium-Jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void registration() throws Exception {
			MemberRegistrationPO.userName(driver).sendKeys("kesav");
			MemberRegistrationPO.password(driver).sendKeys("kesav@123");
			MemberRegistrationPO.confirmPassword(driver).sendKeys("kesav@123");
			Select sel = new Select(MemberRegistrationPO.secretQues(driver));
			sel.selectByIndex(5);
			MemberRegistrationPO.secretAnswer(driver).sendKeys("don bosco");
			
		}	
}