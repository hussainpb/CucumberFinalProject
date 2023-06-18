@ColorsFeature
Feature: Dashboard Color Testing

  @Scenario1
  Scenario: Sky Blue Background
    Given "Set SkyBlue Background" button exists
    When I click on the button 
    Then the background color will change to sky blue


  @Scenario2
  Scenario: White Background Change
    Given "Set White Background" button exists
    When I click on the button
    Then the background color will change to white

