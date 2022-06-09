package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement cv = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cv.click();
		String name = cv.getText();
		System.out.println("name is:"+ name);
		String attributevalue = cv.getAttribute("role");
		System.out.println("attribute value is:"+ attributevalue);
		

	}

}
