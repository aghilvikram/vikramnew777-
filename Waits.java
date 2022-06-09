package browser.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(1));
		//w.until(ExpectedConditions.textToBePresentInElement(e, "aghilnila");     //elementToBeSelected(By.xpath("(//input[@type='text'])[2]")));
		
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.sendKeys("aghilnila");
		WebElement f = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		f.sendKeys("VD");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vikramaghil@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("vikramaghil@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vikramaghil777@");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select se=new Select(day);
		/*if (se.isMultiple()) {
			
			
		}
		else {
		}*/
		se.selectByVisibleText("23");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select mo=new Select(month);
		mo.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select ye=new Select(year);
		ye.selectByVisibleText("1990");
		
		

		
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		for (int i = 0; i <8; i++) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);	*/
		
		
		
		/*FluentWait<WebDriver> fw= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100)).ignoring(Throwable.class);
		fw.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='_8esa'])[1]")));*/
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(("(//button[@type='submit'])[2]"))).click();
		
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='u_d_5_MH']")).click();
		
}
}
