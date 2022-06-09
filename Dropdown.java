package browser.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	WebElement e1;

	public static void main(String[] args) {
		// http://www.leafground.com/pages/Dropdown.html
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement e1 = driver.findElement(By.className("dropdown"));
        Select sel=new Select(e1);
        sel.selectByIndex(4);
        sel.selectByValue("2");
        sel.selectByVisibleText("UFT/QTP");
        
        List<WebElement> options = sel.getOptions();
        System.out.println(options.size());
        for (WebElement we : options) {
        	if(we.getText().contains("Appium")) {
        		we.click();
        	}
        	}
        e1.sendKeys("UFT/QTP");
	}
       
}
