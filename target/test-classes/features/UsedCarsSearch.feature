@Used-Search-Cars 
Feature: Acceptance testing to validate Used Search cars page is working fine. 
	In order to validate that
the search cars page is working fine
we will do the acceptance testing

@Used-Search-Cars-Positive 
Scenario: Validate used search cars page 
	Given I'm on the home page "https://www.carsguide.com.au" of Carsguide 
	When I hover over the menu 
		| Menu|
		| buy + sell |
	And click on the "Used" link 
	And Select car brand as "Ford" from Anymake dropdown 
	And Select Any_Model dropdown as "Mustang" 
	And Select Any_Location dropdown as "WA - All" 
	And Select Any_Price (max) 
		| Price |
		|$200,000|
		|$55.000|
		|$25.000| 
	And Click on "Find My Next Car" blue button 
	Then I should see a list of used cars 
	And the page titles should be "Used Ford Mustang Under 200000 for Sale WA | carsguide" 
	