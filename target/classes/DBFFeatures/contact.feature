@contactButton
Feature: Validate contact Feature

  @contactButton
  Scenario: Verify contact button is clickable
    Given User launch "<URL>"
    When Clicks on contact
    Then Validate contact button is clickable

  @sendMesssageButton
  Scenario: Verify send message button is clickable
    Given User launch "<URL>"
    When Clicks on contact
    When User clicked Send Messsage button
    Then Validates send message button is clickable

  @close
  Scenario: Verify close is clickable
    Given User launch "<URL>"
    When Clicks on contact
    When User clicked Close button 
    Then Validates close button is clickable

  @sendMessage
  Scenario Outline: Verify user can send message
    Given User launch "<URL>"   
    When Clicks on contact
    When Types contact email, contact name and message 
    When User clicked Send Messsage button 
    Then Validates message is sent
    
    
      
    
