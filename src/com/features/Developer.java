package com.features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" developer$")
	public void i_am_a_coreJava_developer(String testerType){
		System.out.println("@Given-->I am a "+testerType+" developer");
	}
	
	@When("^I started development$")
	public void i_started_development(){
		System.out.println("@When-->I started development");
	}
	
	@Then("^I created a \"([a-zA-Z]{1,})\" java program$")
	public void i_created_a_imple_java_program(String jobType){
		System.out.println("@Then-->I created a "+jobType+" java program");
	}
	
	@And("^I am \"([a-zA-Z]{1,})\" experienced$")
	public void i_am_not_experienced(String satisfactionType){
		System.out.println("@And-->I am "+satisfactionType+" experienced");
	}
	
	@But("^My Boss is \"([a-zA-Z]{1,})\" satisfied$")
	public void my_Boss_is_still_satisfied(String parentsSetisfaction){
		System.out.println("@But-->My Boss is "+parentsSetisfaction+" satisfied");
	}
	
	

}
