package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5501/index.html");
		driver.manage().window().maximize();

		List<WebElement> myOptions = driver.findElements(By.tagName("options"));

		for (int i = 0; i < myOptions.size(); i++) {
			if (i % 2 == 0) {
				myOptions.get(i).click();

				System.err.println("sorry i will remove" + myOptions.get(i).getText());

			} else {

				System.out.println("h will keep" + myOptions.get(i).getText());

			}
		}
	}
}
