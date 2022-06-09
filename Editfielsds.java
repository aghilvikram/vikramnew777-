package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editfielsds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("vprvikram@gmail.com");
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("text");
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(attribute);
		WebElement cl=driver.findElement(By.xpath("//input[@type='text'and@value='Clear me!!']"));
        cl.clear();
        WebElement dib = driver.findElement(By.xpath("//input[@disabled='true']"));
        boolean enb = dib.isEnabled();
        System.out.println(enb);
	}

}
