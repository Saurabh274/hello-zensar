package day3.data_driven_tests;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class RegisterUsingFileData {

	public static void main(String[] args) throws Exception {
		String name;
		String email;
		String phone;
		String password;
		String verifyPassword;
		String gender;
		String country;
		String weeklyEmail;
		String monthlyEmail;
		String occasionalEmail;

		
		String fileName = "C:\\Users\\saurgup4\\workspace\\Selenium2\\Saurabh_Selenium2\\src\\day2\\files\\UserAccounts.csv";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);
		while(br.ready()) {
			String line = br.readLine();
			String[] elements = line.split(",");
			name = elements[0];
			email = elements[1];
			phone = elements[2];
			gender = elements[3];
			password = elements[4];
			country = elements[5];
			weeklyEmail = elements[6];
			monthlyEmail = elements[7];
			occasionalEmail = elements[8];
		
		fillTheForm(name, email, phone, gender, password,  
				country, weeklyEmail, monthlyEmail, occasionalEmail);
			}
}
	public static void fillTheForm(String name, String email, String phone, String gender, String password,  
			String country, String weeklyEmail, String monthlyEmail, String occasionalEmail) {

			System.out.println("fillTheForm function is called with name: " +name);
		// Step1: Open the web-browser
			WebDriver driver = SaurabhDriverFactory.getWebDriver();	
		
		// Step2: Open the the web-application URL: http://sdettraining.com/trguitransactions/AccountManagement.aspx
			String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
			driver.get(url);	
		
		// Step3: Click on the CREATE ACCOUNT button
			WebElement CreateAccountButtonWebElement = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
			CreateAccountButtonWebElement.click();
		
		// Step4:  Fill values in all the fields 
			WebElement nameWebElement = driver.findElement(By.id("MainContent_txtFirstName"));
			WebElement emailWebElement = driver.findElement(By.id("MainContent_txtEmail"));
	        WebElement phoneWebElement = driver.findElement(By.id("MainContent_txtHomePhone"));
	        WebElement maleGenderWebElement = driver.findElement(By.id("MainContent_Male"));
	        WebElement femaleGenderWebElement = driver.findElement(By.id("MainContent_Female"));	       	        
	        WebElement passwordWebElement = driver.findElement(By.id("MainContent_txtPassword"));
	        WebElement verifyPasswordWebElement = driver.findElement(By.id("MainContent_txtVerifyPassword"));
	        WebElement countryWebElement = driver.findElement(By.id("MainContent_menuCountry"));
	        Select countrySelectBox = new Select(countryWebElement);
	        
			WebElement weeklyEmailWebElement = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
			WebElement monthlyEmailWebElement = driver.findElement(By.id("MainContent_checkMonthlyEmail"));
			WebElement occasionalWebElement = driver.findElement(By.id("MainContent_checkUpdates"));
	        
			 nameWebElement.sendKeys(name);
		        emailWebElement.sendKeys(email);
		        phoneWebElement.sendKeys(phone);
		        passwordWebElement.sendKeys(password);
		        verifyPasswordWebElement.sendKeys(password);
		        
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
		        //WebElement SubmitButtonWebElement = driver.findElement(By.xpath("//*[@id=\"MainContent_btnSubmit\"]"));
		        //SubmitButtonWebElement.click();
		
	}
}
