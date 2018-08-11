package memberRegistrationPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberRegistrationPO {
	
	/**
	 * To capture the user name text box
	 * @param driver
	 * @return user name text box
	 * @author Kesav
	 */
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='txtUserLoginID']"));
	}
	
	/**
	 * To capture the password text box
	 * @param driver
	 * @return password text box
	 * @author Kesav
	 */
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='txtPassword']"));
	}
	
	public static WebElement confirmPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='txtConfirmPassword']"));
	}
	
	public static WebElement secretQues(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@name='txtSecretQuestion']"));
	}
	
	public static WebElement secretAnswer(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='txtSecretAnswer']"));
	}

}
