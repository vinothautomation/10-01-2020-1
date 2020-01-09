package org.test.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\vinoth\\SELENIUM\\Project\\GIT\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}
}
