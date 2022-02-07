Feature: ErrorDisplayed
  Background: launch Hotels website

   Scenario: verify Error message is displayed after entering invalid credentials
     When Click on “Sign in” link
     Then Enter invalid email address
     Then Enter invalid password
     When Click on Sign in button
     Then Verify Verification message is displayed.