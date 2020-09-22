@Search-Cars 
Feature: Acceptance testing to validate Search page is working fine. 
	In order to validate that
the search cars page is working fine
we will do the acceptance testing

@Search-Cars-Positive 
Scenario: Validate search cars page 
	Given I am on the home page "https://www.carsguide.com.au" of Carsguide 
	When I move to the menu 
		| Menu|
		| buy + sell |
	And click on "Search Cars" link 
	And Select carbrand as "BMW" from Anymake dropdown 
	And Select Any Model dropdown as "1 Series" 
	And Select Any Location dropdown as "NSW - New England" 
	And Select Any Price (max) dropdown as "$45,000" 
	And Click on "Find My Next Car" button 
	Then I should see list of searched cars 
	And the page title should be "Bmw 1 Series Under 45000 for Sale New England NSW | carsguide"
	 
	
	
