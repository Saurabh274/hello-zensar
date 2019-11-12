package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// Write code for cross-browser Testing and create a DriverFactory
public class SeleniumExample6 {
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
        String gender = "female";
        String country = "Australia";
        String weeklyEmail = "True";
        String monthlyEmail = "False";
        String occasionalEmail = "False";
		
			//creating WebElement variables
		WebElement nameWebElement = driver.findElement(By.id("MainContent_txtFirstName"));
		WebElement emailWebElement = driver.findElement(By.id("MainContent_txtEmail"));
        WebElement phoneWebElement = driver.findElement(By.id("MainContent_txtHomePhone"));
        WebElement passwordWebElement = driver.findElement(By.id("MainContent_txtPassword"));
        WebElement verifyPasswordWebElement = driver.findElement(By.id("MainContent_txtVerifyPassword"));
        
        WebElement maleGenderWebElement = driver.findElement(By.id("MainContent_Male"));
        WebElement femaleGenderWebElement = driver.findElement(By.id("MainContent_Female"));
        
        WebElement countryWebElement = driver.findElement(By.id("MainContent_menuCountry"));
		Select countrySelectBox = new Select(countryWebElement);
		
		WebElement weeklyEmailWebElement = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
		WebElement monthlyEmailWebElement = driver.findElement(By.id("MainContent_checkMonthlyEmail"));
		WebElement occasionalWebElement = driver.findElement(By.id("MainContent_checkUpdates"));
        
        nameWebElement.sendKeys(name);
        emailWebElement.sendKeys(email);
        phoneWebElement.sendKeys(phone);
        passwordWebElement.sendKeys(password);
        verifyPasswordWebElement.sendKeys(verifypassword);
        
        if(gender.equalsIgnoreCase("male")) {
        	maleGenderWebElement.click();
        }
        else if (gender.equalsIgnoreCase("female")) {
        	femaleGenderWebElement.click();
        }
        
        countrySelectBox.selectByVisibleText(country);
        
        if(weeklyEmail.equalsIgnoreCase("True")) {
        	weeklyEmailWebElement.click();
        }
        if(monthlyEmail.equalsIgnoreCase("True")) {
        	monthlyEmailWebElement.click();
        }
        if(occasionalEmail.equalsIgnoreCase("False")) {
        	occasionalWebElement.click();
        }
	
		// Step5: Click on SUBMIT button
        WebElement SubmitButtonWebElement = driver.findElement(By.xpath("//*[@id=\"MainContent_btnSubmit\"]"));
        SubmitButtonWebElement.click();
	}

}

