package org.icici;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kumarkalai\\eclipse-workspace\\Kumaravel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");

		// List<WebElement> findElements = driver.findElements(By.tagName("iframe"));

		// WebElement findElement = driver.findElement(By.id("Revamp_Banner_ID"));
		// driver.switchTo().frame("Revamp_Banner_ID");
		//
		// WebElement txtUsername = driver.findElement(By.id("DUMMY1"));
		// txtUsername.sendKeys("Kumar");

		// WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		// txtSearch.sendKeys("Iphone", Keys.ENTER);

		// WebElement btnClickPhone =
		// driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base
		// a-text-normal'])[1]"));
		// btnClickPhone.click();

		// List<WebElement> totlCount =
		// driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base
		// a-text-normal']"));
		// System.out.println(totlCount);
		//
		// for (int i = 0; i < totlCount.size(); i++) {
		// WebElement webElement = totlCount.get(i);
		// String text = webElement.getText();
		// System.out.println(text);
		// }

		WebElement findTable = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = findTable.findElements(By.tagName("th"));
		for (int i = 0; i < headers.size(); i++) {
			WebElement header = headers.get(i);
			String text = header.getText();
			System.out.print(text + " ");
		}
		System.out.println();
		List<WebElement> findRows = findTable.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		for (int i = 0; i < findRows.size(); i++) {
			WebElement row = findRows.get(i);
			List<WebElement> findColumns = row.findElements(By.tagName("td"));

			// to get all row data
			for (int j = 0; j < findColumns.size(); j++) {
				WebElement element = findColumns.get(j);
				String string = element.getText();
				System.out.print(string + " ");
				
				//to check particular data is present
//				if (string.equals("Koushik")) {
//					System.out.println(string);
//					
//				}

			}
			System.out.println();
			
			
			// for first column data
			// WebElement element = findColumns.get(0);
			// String text3 = element.getText();
			// System.out.println(text3);
		}
	}
}
