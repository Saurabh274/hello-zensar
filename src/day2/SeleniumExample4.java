package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Using Variables to Parameterize data in last example
public class SeleniumExample4 {
	public static void main(String[] args) {
		// Step1: Set the System property for webdriver chrome driver, and Open the web-browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurgup4\\Documents\\Selenium\\selenium_drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Step2: Open the the web-application URL: http://sdettraining.com/trguitransactions/AccountManagement.aspx
        String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get(url);
        
        // Step3: Click on the CREATE ACCOUNT button
        WebElement CreateAccountButtonWebElement = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
        CreateAccountButtonWebElement.click();
		
		// Step4: Fill values in the fields Name, Email, Phone, Password, VerifyPassword (Skip the fields: Gender, Country, and Subscriptions )
			
		
			// declaring variables for fields
        String name = "John";
        String email = "John@gmail.com";
        String phone = "9988776655";
        String password = "1234";
        String verifypassword = password;
		
			//creating WebElement variables
		WebElement nameWebElement = driver.findElement(By.id("MainContent_txtFirstName"));
		WebElement emailWebElement = driver.findElement(By.id("MainContent_txtEmail"));
        WebElement phoneWebElement = driver.findElement(By.id("MainContent_txtHomePhone"));
        WebElement passwordWebElement = driver.findElement(By.id("MainContent_txtPassword"));
        WebElement verifyPasswordWebElement = driver.findElement(By.id("MainContent_txtVerifyPassword"));
		
        nameWebElement.sendKeys(name);
        emailWebElement.sendKeys(email);
        phoneWebElement.sendKeys(phone);
        passwordWebElement.sendKeys(password);
        verifyPasswordWebElement.sendKeys(verifypassword);
	
		// Step5: Click on SUBMIT button
	
		
		// Step6: Printing the result
		
		

	}
}
