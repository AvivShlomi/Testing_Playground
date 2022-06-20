import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UITest {

	@Test
	public void testA() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://admin.qa7.vocal-qa.com/");
		System.out.println(driver.getTitle());

		//  this boilerplate can be copied into several tests
		//  Test 1: failing (negative) login -> fill username, password -> do login
		//  Test 2: forgot password flow -> fill username -> do submit
		//  Think about how to improve this test suite from general coding perspective (your call)
		//  You can add tests as much as you would like.

		driver.quit();
	}
}
