package day3.data_driven_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaurabhDriverFactory {
	
	public static WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurgup4\\Documents\\Selenium\\selenium_drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
	}

}
