package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement s1 = driver.findElement(By.xpath(" //a[text()=' 5000']"));
		WebElement s2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(s1, s2).perform();
		WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange']) [5]"));
		WebElement s4 = driver.findElement(By.xpath("( //li[@class='placeholder'] )[1]"));
		a.dragAndDrop(s3, s4).perform();
		
	}

}
