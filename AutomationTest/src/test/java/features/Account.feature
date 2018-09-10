Feature: Account Feature
  In order to provide to the customer account customization and the ability
  to change his personal details,
  as a user,
  I should be able to update my first name

  Scenario Outline: Update Personal Information (First Name) in My Account
    Given user navigates to homepage
    And user press Sign In
    And user enters username <username>
    And user enters password <password>
    And user press Submit button
    And user is navigated to the account page
    And user navigates to his personal information
    When user changes his first name to <updatedName>
    And user types his current password <password>
    And user press save in personal information menu
    Then user can see a message to confirm the change
    And user can see his name <updatedName> in the profile tab

    Examples:
      | username                    | password    | updatedName |
      | test@seleniumwebdriver.com  | Password123 | Clive       |