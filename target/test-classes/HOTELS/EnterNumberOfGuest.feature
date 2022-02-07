Feature: EnterNumberOfGuest


  Scenario: Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.


 Given I Launch hotels.com
 Then  I Click on Travelers
 And I Select Adults as 6
 And I Select “Children” as 2
 Then I Select first child age: 4
 Then I Select second child age: 1
 And I Click Apply
 Then Verify total number of guests in sum of adults and children as same as selected on step #3 and #4