package com.stepdef;

import static org.testng.Assert.assertEquals;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PalindromeTest {
	
	String text;
	String palindrome;
//	boolean  isPalindrome;
	
	@Given("input text {string}")
	public void input_text(String string) {
		text = string;
		System.out.println("inputed text: " + text);
	}
		
	@When("text reversed")
	public void text_reversed() {
		palindrome = new StringBuilder(text).reverse().toString();
		System.out.println("palindrome text: " + palindrome);
//		isPalindrome = text.equalsIgnoreCase(palindrome);
	}
	
	@Then("the result is {string}")
	public void the_result_is(String string) {		
		if (palindrome.equals(text)) {
			System.out.println("text is palindrome");
		} else {
			System.out.println("text is not palindrome");
		}
		System.out.println("");
		
		assertEquals(text, palindrome);
	}

}
