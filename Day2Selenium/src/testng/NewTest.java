package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	
WebDriver ff;
  @Test
  public void f() {
	  
	  ff.get("https://www.google.com/");
		ff.findElement(By.name("q")).sendKeys("selenium");
		ff.findElement(By.name("btnK")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","C:\\Selium 3.0\\geckodriver.exe");	
	  ff =  new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  ff.close();
  }

}
