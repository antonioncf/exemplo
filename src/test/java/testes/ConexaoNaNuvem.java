package testes;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConexaoNaNuvem {
	public static final String USERNAME = "antoniobernardoc1";
	public static final String AUTOMATE_KEY = "6YTkqtL1Yqx3Kzmzk1Kn";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	public void teste() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		
		//Chorme Windows 10
//		caps.setCapability("browser", "Chrome");
//		caps.setCapability("browser_version", "65.0");
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "10");
//		caps.setCapability("resolution", "1024x768");
		
		//Firefox59 windows10 
//		caps.setCapability("browser", "Firefox");
//		caps.setCapability("browser_version", "59.0 beta");
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "10");
//		caps.setCapability("resolution", "1024x768");
//		
		//Edge Preview windows 10
		caps.setCapability("browser", "Edge");
		caps.setCapability("browser_version", "insider preview");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1024x768");
		
		//IE 11 Windows 10
//		caps.setCapability("browser", "IE");
//		caps.setCapability("browser_version", "11.0");
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "10");
//		caps.setCapability("resolution", "1024x768");
		
		//IOS IphoneX
//	    caps.setCapability("browserName", "iPhone");
//	    caps.setCapability("device", "iPhone X");
//	    caps.setCapability("realMobile", "true");
//	    caps.setCapability("os_version", "11.0");
		
		//Galaxy 8 version 7.1 Android
//	    caps.setCapability("browserName", "android");
//	    caps.setCapability("device", "Samsung Galaxy Note 8");
//	    caps.setCapability("realMobile", "true");
//	    caps.setCapability("os_version", "7.1");
		
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.console", "errors");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement campoPesquisa = driver.findElement(By.name("q"));
		campoPesquisa.sendKeys("Secretaria de Estado de Fazenda de Minas Gerais - SEF/MG - SEF/MG");
		campoPesquisa.submit();
	
		WebElement linkSefMg = driver.findElement(By.linkText("Secretaria de Estado de Fazenda de Minas Gerais - SEF/MG - SEF/MG"));
		linkSefMg.click();
		
		WebElement caixaDeTextoBusca = driver.findElement(By.name("query"));
		caixaDeTextoBusca.sendKeys("ICMS");
		
		
		WebElement comandoBuscar = driver.findElement(By.name("submit"));
		comandoBuscar.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
