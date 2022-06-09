package browser.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLauncher {
	 static WebDriver  driver;

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream input=new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\config.properties");
		Properties prop=new Properties();
		prop.load(input);
		String browsera = prop.getProperty("browser");
		String drivlocation = prop.getProperty("DriverLocation");
		
		
		
		if (browsera.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", drivlocation);
		 driver=new ChromeDriver();
		 }
		else if (browsera.equalsIgnoreCase("firefox")){
			System.setProperty("wbdriver.gecko.driver", drivlocation);	
			driver=new FirefoxDriver();
		}
		
		//System.setProperty("wbdriver.msedge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\msedgedriver.exe");
	
	//WebDriver driver2=new FirefoxDriver();
	//WebDriver driver3=new MsedgeDriver();
	driver.get("https://www.facebook.com/");
	//driver2.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver2.manage().window().maximize();
	String t = driver.getTitle();
	//String t1=driver2.getTitle();
	System.out.println("page title is"+ t);
	//System.out.println("pt"+t1);
	String c = driver.getCurrentUrl();
	//String c1=driver2.getCurrentUrl();
	System.out.println("current url is"+c);
	//System.out.println("url is"+c1);
	//driver.close();
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("vikram");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("devi");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	
	
	
	
	}
		
	}


