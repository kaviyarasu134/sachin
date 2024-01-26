package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		
		
		WebElement crt=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		crt.click();
		
		
	
		
		
		
		
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		
		firstname.sendKeys("kavi");
		
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		
		lastname.sendKeys("12345");
		
		WebElement ph=driver.findElement(By.name("reg_email__"));
		
		ph.sendKeys("123");
		
		
		
		
		
		
		
		
	
		
		
	}

}
