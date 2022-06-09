package browser.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		WebElement e1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
        e1.click();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        WebElement e2 = driver.findElement(By.cssSelector("button[onclick='confirmAlert()']"));
	    e2.click();
	    Alert alt1=driver.switchTo().alert();
	    alt1.accept();
	    
	    WebElement e3 = driver.findElement(By.xpath("//*[text()='Prompt Box']"));
	    e3.click();
	    Alert alt2=driver.switchTo().alert();
	    String text = alt2.getText();
	    alt2.accept();
	   
	    System.out.println(text);
	}

}
