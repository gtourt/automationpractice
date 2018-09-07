Feature: Account Feature
  Make changes into the account page

  Scenario: Login as an autheticated user and change first name
    Given user navigates to homepage
    And user press Sign In
    When user is authenticated and has signed in
    And user is navigated to the account page
    And user goes to change the personal information
    And user changes his first name
    And user types his current password
    And user press save in personal information menu
    Then user can see a message to confirm the change
    And user can see his name changed in the profile tab
