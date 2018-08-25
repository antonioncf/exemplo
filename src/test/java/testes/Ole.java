package testes;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ole {
	@Test
	public  void testeOle() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Broswers\\chromedriver39.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ole.com.ar/");
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement linkSefMg = driver.findElement(By.xpath("//*[@class='answer-text']"));
		linkSefMg.getText().lastIndexOf("Brasil");
		linkSefMg.click();
		Thread.sleep(3000);
}
}
