package com.xfinity.project.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.xfinity.utilities.Config;
import com.xfinity.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpeedTest {
	private WebDriver driver;
	
	@Given("^User sets Implicit wait to (\\d+) seconds$")
	public void user_sets_Implicit_wait_to_seconds(int arg1) throws Throwable {
	    driver=Driver.getDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^User Navigate to http://speedtest\\.xfinity\\.com/$")
	public void user_Navigate_to_http_speedtest_xfinity_com() throws Throwable {
	   driver.get(Config.getProperty("url"));
	}
	
	@When("^User waits until Start Test button is clickable$")
	public void user_waits_until_Start_Test_button_is_clickable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User clicks on Start Test button$")
	public void user_clicks_on_Start_Test_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User waits until Blinking Download icon disappears$")
	public void user_waits_until_Blinking_Download_icon_disappears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User reads Download speed value into a variable$")
	public void user_reads_Download_speed_value_into_a_variable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User waits until Blinking Upload icon disappears$")
	public void user_waits_until_Blinking_Upload_icon_disappears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^User reads Upload speed value into a variable$")
	public void user_reads_Upload_speed_value_into_a_variable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^User sets Following Conditions:$")
	public void user_sets_Following_Conditions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
