package browser.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPDN {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e = driver.findElement(By.xpath("//h3[@id='heading8826']"));
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		WebElement s = driver.findElement(By.xpath("//div[text()='Thursday']"));
		js.executeScript("arguments[0].scrollIntoView(false)", s);*/
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\Screenshot\\fb.jpeg");
		FileUtils.copyFile(f, d);
		
	
		
	}

}
