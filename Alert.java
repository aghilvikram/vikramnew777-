package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']" )).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']" )).click();
		
		 org.openqa.selenium.Alert a = driver.switchTo().alert();
		 String s = a.getText();
		 System.out.println(s);
		 a.accept();
		 
		 driver.findElement(By.xpath("//a[text()='Alert with Textbox ']" )).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 System.out.println(a.getText());
		 a.sendKeys("vikram");
		 a.accept();
		 
		 
		
	}

}
