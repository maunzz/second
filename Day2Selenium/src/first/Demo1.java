package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selium 3.0\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.google.com/");
		ff.findElement(By.name("q")).sendKeys("selenium");
		ff.findElement(By.name("btnK")).click();
		ff.close();
	}

}
