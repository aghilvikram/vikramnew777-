package browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement e1 = driver.findElement(By.id("position"));
		
		Point xy=e1.getLocation();
		int x = xy.getX();
		int y = xy.getY();
		System.out.println("x value is :"+x+"y value is :"+y);
		
		WebElement e2 = driver.findElement(By.id("color"));
		String color1 = e2.getCssValue("background-color");
		System.out.println(color1);
		
		
		WebElement e3 = driver.findElement(By.xpath("//button[contains(text(),'What is my size?')]"));
        Dimension size = e3.getSize();
        int height = size.getHeight();
        int width = size.getWidth();
        System.out.println("height is:"+height+"width is:"+width);
        driver.findElement(By.id("home")).click();
	}

}
