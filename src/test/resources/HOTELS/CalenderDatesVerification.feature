Feature: CalenderDatesVerification
  Background: Launch Hotels.com

  Scenario: Verify for current Month past dates are disabled
  When I Click on Check in Calender
  Then I Go to current month if not displayed
  Then I Verify For current month that past dates(if any)are disabled

  Scenario: Verify for current Month past dates are disabled
    When I Click on Check in Calender
    Then I Go to current month if not displayed
    Then I Verify For current month back button on current month is disabled


