package DRAG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	
	public static void main(String args[])
	{
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Testing");
	Actions builder=new Actions(driver);
	builder.sendKeys(Keys.TAB).perform();
	builder.sendKeys("hello").perform();
	builder.sendKeys(Keys.RETURN).perform();
	
	

}
}
