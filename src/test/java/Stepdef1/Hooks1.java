package Stepdef1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks1 {
	public static WebDriver driver;
	
      @Before()
	
	  public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
	}
	
	@After()
	public void TearDown() {
		
		driver.quit();
		

	
		
	}

}



