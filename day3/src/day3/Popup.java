package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver cr = new ChromeDriver();
		cr.get("file:///C:/Users/mounika.sanjeevi/Links/popup.htm");
		//cr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		cr.findElement(By.name("popup")).click();
		//cr.manage().window().maximize();
		//cr.navigate().refresh();
		//String Title = cr.getTitle();
		//System.out.println("Title of the page is "+Title);
		cr.switchTo().alert().accept();
		//System.out.println("the content in pop up is "+popup.getText());
		//popup.accept();
		//cr.close();
	}

}
