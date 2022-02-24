package org.icici;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kumarkalai\\eclipse-workspace\\Kumaravel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.facebook.com/'");
//		String attribute = driver.switchTo().activeElement().getAttribute("id");
//		System.out.println(attribute);

	
		WebElement findElement = driver.findElement(By.cssSelector("#email"));
		findElement.sendKeys("Kumar");
	}

}
