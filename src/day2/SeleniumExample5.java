package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Write code for cross-browser Testing and create a DriverFactory
public class SeleniumExample5 {
	public static void main(String[] args) {
		// Step1: Set the System property for webdriver chrome/gecko driver, and Open the web-browser
		WebDriver driver = SaurabhDriverFactory.getWebDriver();

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
	}

}

