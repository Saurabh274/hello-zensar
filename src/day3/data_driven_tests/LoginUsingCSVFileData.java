package day3.data_driven_tests;

import java.io.BufferedReader;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.data_driven_tests.SaurabhDriverFactory;


public class LoginUsingCSVFileData {
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\saurgup4\\workspace\\Selenium2\\Saurabh_Selenium2\\src\\day3\\files\\LoginDetails.csv";
		FileReader fileReader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fileReader);
		while (br.ready()) {
			String row = br.readLine();
			String[] elements = row.split(",");
			String email = elements[0];
			String password = elements[1];
			fillTheLoginForm(email,password);
		}
	
			
	}
	public static void fillTheLoginForm(String email, String password) {
		System.out.println("Filling the Login form");
		// Step1: Load the driver using DriverFactory and then open the url: "http://sdettraining.com/trguitransactions/AccountManagement.aspx"
		WebDriver driver = SaurabhDriverFactory.getWebDriver();
		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(url);
	
		
		// Step2: Fill the email Id in the browser field
		 WebElement emailIdWebElement = driver.findElement(By.id("MainContent_txtUserName"));
	        emailIdWebElement.sendKeys(email);
	        // Step3: Fill the password in the browser
	        WebElement passwordWebElement = driver.findElement(By.id("MainContent_txtPassword"));
	        passwordWebElement.sendKeys(password);	 

	        // Step4: Click the Login button
	        WebElement loginButtonWebElement = driver.findElement(By.id("MainContent_btnLogin"));
	        loginButtonWebElement.click();
	        // Step-5 close the browser window
		
		
		}
}
