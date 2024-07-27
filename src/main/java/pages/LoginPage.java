package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.DriverFectory;
import static pages.Elements.*;

public class LoginPage extends DriverFectory {

	public WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

//start
public String loginScreen() {
	return driver.findElement(By.xpath(LoginScreen)).getText();
}

//login
	public void inputUser(String user) {
		driver.findElement(By.xpath(UserName)).click();
		driver.findElement(By.xpath(UserName)).sendKeys(user);
	}

	public void inputPassword(String password) {
		driver.findElement(By.xpath(Password)).click();
		driver.findElement(By.xpath(Password)).sendKeys(password);
	}

	public void sendButton() {
		driver.findElement(By.xpath(BtnLogin)).click();
	}

}
