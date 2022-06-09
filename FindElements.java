package browser.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> e = driver.findElements(By.tagName("input"));
		System.out.println(e.size());
		/*for (WebElement webElement : e) {
			webElement.click();*/
			for (int i = 0; i < e.size(); i++) {
				String tg = e.get(i).getTagName();
				System.out.println(tg);
				
			}
		}
	}


