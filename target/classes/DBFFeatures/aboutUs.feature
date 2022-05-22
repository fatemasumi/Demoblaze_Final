@aboutUSFeature
Feature: Validate About us feature

  @aboutUsWindow
  Scenario: validate About us button is clickable
    Given user launch "<URL>"
    When click on About us and window pop-u
    Then user validate window 
    
    @playIcon
  Scenario: validate Play Video icon is Clickable
    Given user launch "<URL>"
    When click on About us and window pop-u
    When click the play video icon
    Then user validate video played 

  @xButton
  Scenario: validate X button on About us window is clickable
    Given user launch "<URL>"
    When click on About us and window pop-u
    When Click on X button
    Then about us window closed and navigated to home page
    
    @playButton
  Scenario: validate Play Video button is Clickable
    Given user launch "<URL>"
    When click on About us and window pop-u
    When click the play video button
    Then user validate video replayed 

  @closeWindow
  Scenario: validate Close button on About us window is clickable
    Given user launch "<URL>"
    When click on About us and window pop-u
    When Click on Close button
    Then about us window closed and navigated to home page
