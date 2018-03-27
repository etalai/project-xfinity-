package com.xfinity.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.xfinity.pageObject.HomePage;
import com.xfinity.utilities.Config;
import com.xfinity.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class speetest {
	private static WebDriver driver=Driver.getDriver();

	@When("^User Navigates to URL$")
	public void user_Navigates_to_URL() throws Throwable {
	  driver.get(Config.getProperty("url"));
	}
	
	@When("^User Waits until Start Test button is clickable$")
	public void user_Waits_until_Start_Test_button_is_clickable() throws Throwable {
	   WebDriverWait wait=new WebDriverWait(driver, 60);
	   HomePage hp=new HomePage(driver);
	   wait.until(ExpectedConditions.visibilityOf(hp.startBTN));
	   
	}
	
	@When("^User Click on Start Test button$")
	public void user_Click_on_Start_Test_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User Wait until Blinking Download icon disappears$")
	public void user_Wait_until_Blinking_Download_icon_disappears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User Read Download speed value into a variable$")
	public void user_Read_Download_speed_value_into_a_variable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^Wait until Blinking Upload icon disappears$")
	public void wait_until_Blinking_Upload_icon_disappears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^Read Upload speed value into a variable$")
	public void read_Upload_speed_value_into_a_variable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^Set Following Conditions:$")
	public void set_Following_Conditions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
