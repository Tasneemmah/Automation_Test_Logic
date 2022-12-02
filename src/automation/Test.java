package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		driver.manage().window().maximize();

		List<WebElement> myOptions = driver.findElements(By.tagName("option"));

		for (int i = 0; i < myOptions.size(); i++) {
			if (i % 2 == 0) {
				myOptions.get(i).click();

				System.err.println("sorry i will remove" + myOptions.get(i).getText());
				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click(); 

			} else {

				System.out.println("h will keep" + myOptions.get(i).getText());
			}
		}
		List <WebElement> myOptionsNew = driver.findElements(By.tagName("option"));
		System.out.println(myOptionsNew.size()+ "this is after the remove process" );
	}
}
