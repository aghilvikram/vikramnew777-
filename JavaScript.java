package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','greens')", e);
		WebElement s = driver.findElement(By.id("pass"));
		js.executeScript("arguments[1].setAttribute('value','tech')", s,e);
		
		WebElement m = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", m);
		
		
		
		
	}

}
