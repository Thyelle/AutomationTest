package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFectory {

	protected static WebDriver driver;

	public DriverFectory(WebDriver driver) {
		DriverFectory.driver = driver;
	}

	public static synchronized WebDriver getDriver() {
		if (driver == null) {
			try {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			// driver.quit();
			driver.close();
			driver = null;
		}

	}
}
