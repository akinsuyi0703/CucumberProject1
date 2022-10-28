package com.stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	

	@Given("user is on signinPage")
	public void user_is_on_signin_page() {
		
		System.out.println("Step1: User is on SigningPage");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
	    
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		
		System.out.println("Step2: User click on signin");
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@And("user land on login page")
	public void user_should_land_on_login_page() {
		
		System.out.println("Step3: User validate signingpage");
	    String actTitle=driver.getTitle();
		String expTitle="Login - My Store";
		Assert.assertEquals(actTitle, expTitle);
	    
    }
	


  
   @Then("^user enters the (.*) and (.*)$") //myStore feature with example parameters
  
    public void user_enters_the_username_and_password(String uname, String pass) {
		
		System.out.println("Step4: User enters username and password");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
		driver.findElement(By.name("passwd")).sendKeys(pass);

	}

	@And("click on login button")
	public void click_on_login_button() {
		
		System.out.println("Step5: User clicked on loging button");
		
		driver.findElement(By.id("SubmitLogin")).sendKeys(Keys.RETURN);


	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
         
		System.out.println("Step4: User land on homePage");
		
		driver.close();

	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$") //Login feature without example keyword parameters
	  
	  
	    public void user_enters_username_and_password(String Uname, String Pass) {
			
			System.out.println("Step4: User enters username and password");
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Uname);
			driver.findElement(By.name("passwd")).sendKeys(Pass);

		}
	
	@Then("user enters credentials using DataTable")//Data Table feature
	public void user_enters_credentials_using_DataTable(DataTable dataTable) {
		
		System.out.println("Step4: User enters username and password");
		List<List<String>> data=dataTable.cells();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("passwd")).sendKeys(data.get(0).get(1));
		

	}
	
	
	


}
