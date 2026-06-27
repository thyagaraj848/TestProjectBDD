package locators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oranagelocator {
	
	

	    WebDriver driver;
	    WebDriverWait wait;

	    public Oranagelocator(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    // Locators
	  public  By username = By.name("username");
	  public   By password = By.name("password");
	  public  By loginBtn = By.xpath("//button[@type='submit']");
	  public  By dashboard = By.xpath("//h6[text()='Dashboard']");
	  public  By invalidMsg = By.xpath("//p[contains(@class,'oxd-alert-content-text')]");
	  public   By requiredMsg = By.xpath("//span[text()='Required']");

	    public void enterUsername(String user) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
	    }

	    public void enterPassword(String pass) {
	    
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(password));

	        driver.findElement(password).sendKeys(pass);
	        
	        
	        
	    }

	    public void clickLogin() {
	        
	        
	        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));

	        driver.findElement(loginBtn).click();

	    }
	        
	    

	    public String getDashboardText() {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard)).getText();
	    }

	    public String getInvalidMessage() {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(invalidMsg)).getText();
	    }

	    public String getRequiredMessage() {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(requiredMsg)).getText();
	    }

	    public void login(String user,String pass)
	    {
	        enterUsername(user);
	        enterPassword(pass);
	        
	    }

	}
	
	
	
	
	
	
	
	
	
	
	
	


