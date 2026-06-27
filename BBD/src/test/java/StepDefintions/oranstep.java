package StepDefintions;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.*;

	
import locators.Oranagelocator;

	public class oranstep {

	    WebDriver driver;
	    Oranagelocator login;
	    WebDriverWait wait;

	    @Before
	    public void setup() {

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(35));


	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        System.out.println("Title : " + driver.getTitle());
	        System.out.println("URL   : " + driver.getCurrentUrl());
	        

	        login = new Oranagelocator(driver);
	        

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        
	        
	        

	    }

	    @After
	    public void tearDown() {

	        driver.quit();

	    }
	   

	    @Given("User opens OrangeHRM Login page")
	    public void openPage() {

	    }

	    @Given("User enters valid username and password")
	    public void validLogin() {

	        login.login("Admin","admin123");

	    }

	    @Given("User enters valid username and invalid password")
	    public void invalidPassword() {

	        login.login("Admin","admin12");

	    }

	    @Given("User leaves username empty and enters password")
	    public void emptyUsername() {

	        login.enterPassword("admin123");

	    }

	    @When("User clicks Login button")
	    public void clickLogin() {

	        login.clickLogin();

	    }

	    @Then("Dashboard should be displayed")
	    public void dashboardDisplayed() {

	    	
	    	{
	    		

	    		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    		    wait.until(ExpectedConditions.visibilityOfElementLocated(login.dashboard));

	    		    Assert.assertEquals(driver.findElement(login.dashboard).getText(), "Dashboard");

	    		    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

	    		}
	    	}
	    

	    @Then("Invalid Credentials message should be displayed")
	    public void invalidMessage() {

	        Assert.assertEquals(login.getInvalidMessage(),"Invalid credentials");

	    }

	    @Then("Required message should be displayed")
	    public void requiredMessage() {

	        Assert.assertEquals(login.getRequiredMessage(),"Required");

	    }

	}
	
	
	
	


