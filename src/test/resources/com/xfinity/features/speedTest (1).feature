Feature: Xfinity project

Scenario: Xfinity speed test 
	Given User sets Implicit wait to 30 seconds 
	When  User Navigates to http://speedtest.xfinity.com/ 
	And   User waits until Start Test button is clickable 
	When  User clicks on Start Test button 
	When  User waits until Blinking Download icon disappears 
	When  User reads Download speed value into a variable 
	When  User waits until Blinking Upload icon disappears 
	When  User reads Upload speed value into a variable 
	Then  User sets Following Conditions: 
	
	#			If Download speed is more than 100 Mbps --> print SuperFast download speed
	#			If Download speed is between 50 and 100 Mbps --> print Excellect download speed
	#			If Download speed is between 20 and 50 Mbps --> print Acceptable download speed
	#			If Download speed is less than 20 --> print poor download speed 
	
	#			If Upload speed is more than 100 Mbps --> print SuperFast Upload speed
	#			If Upload speed is between 50 and 100 Mbps --> print Excellect Upload speed
	#			If Upload speed is between 20 and 50 Mbps --> print Acceptable Upload speed
	#			If Upload speed is less than 20 --> print poor Upload speed 
	
	
	
	
