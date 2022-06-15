import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class UITest {

	@Test
	public void testA() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://admin.qa7.vocal-qa.com/");
		System.out.println(driver.getTitle());

		//  this boilerplate can be copied into several tests
		//  Test 1: failing (negative) login -> fill username, password -> do login
		//  Test 2: forgot password flow -> fill username -> do submit
		//  Think about how to improve this test suite from general coding perspective (your call)

		driver.quit();
	}
}