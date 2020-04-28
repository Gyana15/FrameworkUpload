
Feature: This feature tests login to app

  @Regression @Login
  Scenario: Login to app
    Given Launch the app
    When <User1> logs into the app
    Then <User1> gets successful login validation
