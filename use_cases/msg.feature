Feature: Broadcast message to board
Scenario:  message added to board
Given open the website and go to login page 
When fill username and password and click on login 
And click messages and enter the message and subject then click post
Then The message added to the board.
