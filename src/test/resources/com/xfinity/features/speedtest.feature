Feature: Xfinity Test 

Scenario: Xfinity speed test 
	Given User Navigates to URL 
	And User Waits until Start Test button is clickable 
	When User Click on Start Test button 
	When User Wait until Blinking Download icon disappears 
	When User Read Download speed value into a variable 
	When Wait until Blinking Upload icon disappears 
	When Read Upload speed value into a variable 
	Then Set Following Conditions: 
	
