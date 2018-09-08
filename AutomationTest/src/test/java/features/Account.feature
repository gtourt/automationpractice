Feature: Account Feature
  Update first name of the account

  Scenario: Login as an autheticated user and change first name
    Given user navigates to homepage
    And user press Sign In
    And user enters Username
    And user enters Password
    And user press Submit button
    And user is navigated to the account page
    And user navigates to his personal information
    When user changes his first name
    And user types his current password
    And user press save in personal information menu
    Then user can see a message to confirm the change
    And user can see his name changed in the profile tab
