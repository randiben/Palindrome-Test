
Feature: Palindrome Test
    
	Scenario Outline: Check text is palindrome
   Given input text <text>
   When text reversed
   Then the result is <result>
    
   Examples:
   | text				| result	|
   | "bebeb"		|	"true"	|
   | "randi" 		| "false" |
   | "rotavator"| "true"	|
