package com.features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {

	@Given("^I am a \"([a-zA-Z]{1,})\" tester$")
	public void i_am_a_manual_tester(String testertype){
		System.out.println("@Given-->I am a "+testertype+" tester");
	}
	
	@When("^I apply for a job$")
	public void i_apply_for_a_job(){
		System.out.println("@When-->I apply for a job");
	}
	
	@Then("^I got a \"([a-zA-Z]{1,})\" paid job$")
	public void  i_got_a_less_paid_job(String f){
		System.out.println("@Then--> I got a "+f+" paid job");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void  i_am_not_satisfied_with_my_salary(String n){
		System.out.println("@And-->I am "+n+" satisfied with my salary");
	}
	
	@But("^My parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void  my_parents_are_still_satisfied(String j){
		System.out.println("@But-->My parents are "+j+" satisfied");
	}
	
	
	
}
