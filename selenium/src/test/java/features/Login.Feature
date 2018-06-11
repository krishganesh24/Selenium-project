Feature: Login functionality of Testleaf application. 
Scenario: login test 

	Given invoke the application 
	And enter the username
	And enter the password 
	And click the login
	Then verify login is success