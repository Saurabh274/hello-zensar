package day1;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

// Write the Automation for New Account Page here
public class SeleniumExample3 {
    public static void main(String[] args) {
        // Step1: Set the System property for webdriver chrome driver, and Open the web-browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurgup4\\Documents\\Selenium\\selenium_drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Step2: Open the the web-application URL: http://sdettraining.com/trguitransactions/AccountManagement.aspx
        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
    
        
        // Step3: Click on the CREATE ACCOUNT button
        driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
        
        // Step4: Fill values in the fields Name, Email, Phone, Password, VerifyPassword (Skip the fields: Gender, Country, and Subscriptions )
        driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Manish");
        driver.findElement(By.id("MainContent_txtEmail")).sendKeys("manish@yahoo.com");
        driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("7788665544");
        driver.findElement(By.id("MainContent_txtPassword")).sendKeys("manish");
        driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("manish"); 
        
    
        // Step5: Click on SUBMIT button
        
        
        // Step6: Printing the result
        
    }
}