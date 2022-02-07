Feature: InvalidDataIsDisplayed

     Background: Launch Hotels

     Scenario:Verify error is displayed (Please check your email address)
     When Click on SignIn link
     Then Click on SignUp link
     When Enter invalid email address with at least '@' symbol (#!@###)->
     Then Verify error is displayed (Please check your email address)

     Scenario: Verify password entered less than 6-characters Please enter a password containing at least six characters is displayed
          When enter Email address
          Then enter password less than 6 characters
          Then verify text Please enter a password containing at least six characters is displayed

     Scenario: Verify password entered more than 20 characters Your password cannot be more than 20 characters long is displayed
         When enter Email address
         Then enter password more than 20 characters
         Then verify Your password cannot be more than 20 characters long text is displayed

     Scenario:  Verify Please check your first name is displayed on invalid name input
          When enter Email address
          Then enter password
          When enter invalid First name
          Then Verify Please check your first name is displayed on invalid name input

     Scenario: Verify Please check your last name is displayed on invalid last name input
          When enter Email address
          Then enter password
          Then enter First name
          When enter invalid last name
          Then Verify Please check your last name is displayed on invalid last name input
