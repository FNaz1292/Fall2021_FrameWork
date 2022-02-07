Feature: ChangeDateButtonIsDisplayed
  Background: Launch Hotels.com & I Click Apply
    Scenario: Verify at the end of search results Text: Tell us how we can improve our site is displayed
    When I Enter “bora” in destination
    And I Select “Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
    Then I Select April 1, 2022 as Check-in
    And I Select April 10, 2022 as Check-out
    Then I Click on “Search”button
    Then I Verify at the end of search results Text: Tell us how we can improve our site is displayed

  Scenario: Verify at the end of search results Button Share feedback is displayed and enabled
    When I Enter “bora” in destination
    Then I Select “Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
    Then I Select April 1, 2022 as Check-in
   And I Select April 10, 2022 as Check-out
    Then I Click on “Search”button
    Then I Verify at the end of search results Button Share feedback is displayed and enabled

